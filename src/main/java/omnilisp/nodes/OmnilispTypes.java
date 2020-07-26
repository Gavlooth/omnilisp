package omnilisp.nodes;

import java.math.BigInteger;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.ImplicitCast;
import com.oracle.truffle.api.dsl.TypeCast;
import com.oracle.truffle.api.dsl.TypeCheck;
import com.oracle.truffle.api.dsl.TypeSystem;
// import com.oracle.truffle.sl.SLLanguage;
// import com.oracle.truffle.sl.runtime.SLBigNumber;
// import com.oracle.truffle.sl.runtime.SLNull;

/**
 * The type system of SL, as explained in {@link SLLanguage}. Based on the {@link TypeSystem}
 * annotation, the Truffle DSL generates the subclass {@link SLTypesGen} with type test and type
 * conversion methods for some types. In this class, we only cover types where the automatically
 * generated ones would not be sufficient.
 */
@TypeSystem({long.class, boolean.class})
public abstract class SLTypes {

    @TypeCheck(SLNull.class)
    public static boolean isSLNull(Object value) {
        return value == SLNull.SINGLETON;
    }

    @TypeCast(SLNull.class)
    public static SLNull asSLNull(Object value) {
        assert isSLNull(value);
        return SLNull.SINGLETON;
    }
    @ImplicitCast
    @TruffleBoundary
    public static SLBigNumber castBigNumber(long value) {
        return new SLBigNumber(BigInteger.valueOf(value));
    }
}

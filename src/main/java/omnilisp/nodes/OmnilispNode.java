
package Omnilisp.node;

import java.math.BigInteger;

// import mumbler.truffle.OmnilispTypes;
// import mumbler.truffle.OmnilispTypesGen;
// import mumbler.truffle.type.OmnilispFunction;
// import mumbler.truffle.type.OmnilispList;
// import mumbler.truffle.type.OmnilispSymbol;

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;





// @TypeSystemReference(OmnilispTypes.class)
@NodeInfo(language = "Omnilisp Language", description = "The abstract base node for all expressions")
public abstract class OmnilispNode extends Node {
    @CompilationFinal
    private SourceSection sourceSection;

    @CompilationFinal
    private boolean isTail = false;

    @Override
    public SourceSection getSourceSection() {
    	return this.sourceSection;
    }

    public void setSourceSection(SourceSection sourceSection) {
    	this.sourceSection = sourceSection;
    }

    public boolean isTail() {
        return this.isTail;
    }

    public void setIsTail() {
        this.isTail = true;
    }

    public abstract Object execute(VirtualFrame virtualFrame);

    public long executeLong(VirtualFrame virtualFrame)
            throws UnexpectedResultException {
        return OmnilispTypesGen.expectLong(this.execute(virtualFrame));
    }

    public boolean executeBoolean(VirtualFrame virtualFrame)
            throws UnexpectedResultException {
        return OmnilispTypesGen.expectBoolean(this.execute(virtualFrame));
    }

    public BigInteger executeBigInteger(VirtualFrame virtualFrame)
            throws UnexpectedResultException {
        return OmnilispTypesGen.expectBigInteger(this.execute(virtualFrame));
    }

    public OmnilispSymbol executeOmnilispSymbol(VirtualFrame virtualFrame)
            throws UnexpectedResultException {
        return OmnilispTypesGen.expectOmnilispSymbol(this.execute(virtualFrame));
    }

    public OmnilispFunction executeOmnilispFunction(VirtualFrame virtualFrame)
            throws UnexpectedResultException {
        return OmnilispTypesGen.expectOmnilispFunction(
                this.execute(virtualFrame));
    }

    public OmnilispList<?> executeOmnilispList(VirtualFrame virtualFrame)
            throws UnexpectedResultException {
        return OmnilispTypesGen.expectOmnilispList(this.execute(virtualFrame));
    }

    public String executeString(VirtualFrame virtualFrame)
            throws UnexpectedResultException{
        return OmnilispTypesGen.expectString(this.execute(virtualFrame));
    }

    protected boolean isArgumentIndexInRange(VirtualFrame virtualFrame,
            int index) {
        return (index + 1) < virtualFrame.getArguments().length;
    }

    protected Object getArgument(VirtualFrame virtualFrame, int index) {
        return virtualFrame.getArguments()[index + 1];
    }

    protected static MaterializedFrame getLexicalScope(Frame frame) {
        Object[] args = frame.getArguments();
        if (args.length > 0) {
            return (MaterializedFrame) frame.getArguments()[0];
        } else {
            return null;
        }
    }
}

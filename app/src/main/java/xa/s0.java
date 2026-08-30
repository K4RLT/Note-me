package xa;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class s0 extends u2 {

    /* renamed from: c, reason: collision with root package name */
    public final BitSet f30518c;

    public /* synthetic */ s0(BitSet bitSet, String str) {
        super(str);
        this.f30518c = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // xa.u0
    public final void j(BitSet bitSet) {
        bitSet.or(this.f30518c);
    }

    @Override // xa.u0
    public final boolean t(char c10) {
        return this.f30518c.get(c10);
    }
}

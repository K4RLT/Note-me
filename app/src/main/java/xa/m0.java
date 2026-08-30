package xa;

import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m0 extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public final char[] f30463b;

    public m0() {
        char[] charArray = "-_@=,;".toCharArray();
        this.f30463b = charArray;
        Arrays.sort(charArray);
    }

    @Override // xa.u0
    public final void j(BitSet bitSet) {
        for (char c10 : this.f30463b) {
            bitSet.set(c10);
        }
    }

    @Override // xa.u0
    public final boolean t(char c10) {
        if (Arrays.binarySearch(this.f30463b, c10) >= 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c10 : this.f30463b) {
            sb2.append(u0.L(c10));
        }
        sb2.append("\")");
        return sb2.toString();
    }
}

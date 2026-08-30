package c2;
import c2.b;
import c2.e;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: d, reason: collision with root package name */
    public static e f3508d;

    @Override // b
    public final int[] a(int i) {
        int length = e().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            while (i < length && e().charAt(i) == '\n' && (e().charAt(i) == '\n' || (i != 0 && e().charAt(i - 1) != '\n'))) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i10 = i + 1;
            while (i10 < length && !l(i10)) {
                i10++;
            }
            return b(i, i10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] f(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.e()
            int r0 = r0.length()
            if (r0 > 0) goto Lb
            goto L2c
        Lb:
            if (r5 > 0) goto Le
            goto L2c
        Le:
            if (r5 <= r0) goto L11
            r5 = r0
        L11:
            r0 = 10
            if (r5 <= 0) goto L2a
            java.lang.String r1 = r4.e()
            int r2 = r5 + (-1)
            char r1 = r1.charAt(r2)
            if (r1 != r0) goto L2a
            boolean r1 = r4.l(r5)
            if (r1 != 0) goto L2a
            int r5 = r5 + (-1)
            goto L11
        L2a:
            if (r5 > 0) goto L2e
        L2c:
            r5 = 0
            return r5
        L2e:
            int r1 = r5 + (-1)
        L30:
            if (r1 <= 0) goto L4e
            java.lang.String r2 = r4.e()
            char r2 = r2.charAt(r1)
            if (r2 == r0) goto L4b
            if (r1 == 0) goto L4e
            java.lang.String r2 = r4.e()
            int r3 = r1 + (-1)
            char r2 = r2.charAt(r3)
            if (r2 != r0) goto L4b
            goto L4e
        L4b:
            int r1 = r1 + (-1)
            goto L30
        L4e:
            int[] r5 = r4.b(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.e.f(int):int[]");
    }

    public final boolean l(int i) {
        if (i > 0 && e().charAt(i - 1) != '\n') {
            if (i == e().length() || e().charAt(i) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }
}

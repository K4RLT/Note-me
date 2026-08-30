package mg;
import d.d;

import ig.w;
import sg.h;
import ya.dc;

/* loaded from: classes.dex */
public abstract class d {
    static {
        char[] cArr = h.f25275x;
        dc.a("\"\\");
        dc.a("\t ,=");
    }

    public static long a(w wVar) {
        String c10 = wVar.f18601z.c("Content-Length");
        if (c10 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(c10);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(w wVar) {
        if (!wVar.f18596u.f239b.equals("HEAD")) {
            int i = wVar.f18598w;
            if (((i >= 100 && i < 200) || i == 204 || i == 304) && a(wVar) == -1 && !"chunked".equalsIgnoreCase(wVar.f("Transfer-Encoding"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static int c(int i, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b1, code lost:
    
        r36 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b5, code lost:
    
        if (r19 != Long.MIN_VALUE) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b7, code lost:
    
        r19 = Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01de, code lost:
    
        r0 = r35.f18538d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e2, code lost:
    
        if (r15 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e4, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x021a, code lost:
    
        if (r0.length() == r15.length()) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x021c, code lost:
    
        r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f22087h;
        r6.getClass();
        r9 = java.net.IDN.toUnicode(r15).split("\\.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0231, code lost:
    
        if (r6.f22088a.get() != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023b, code lost:
    
        if (r6.f22088a.compareAndSet(false, true) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023d, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0359, code lost:
    
        if (r0 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x035b, code lost:
    
        r10 = 0;
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03b3, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0268, code lost:
    
        r6.f22089b.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x026e, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x036b, code lost:
    
        if (r13 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0373, code lost:
    
        if (r13.startsWith("/") != false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0376, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03a8, code lost:
    
        r16 = new ig.j(r5, r36, r19, r15, r13, r23, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x037a, code lost:
    
        r0 = r35.f18541h;
        r2 = r0.indexOf(47, r35.f18535a.length() + 3);
        r0 = r0.substring(r2, jg.b.i(r0, r2, r0.length(), "?#"));
        r2 = r0.lastIndexOf(47);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x039d, code lost:
    
        if (r2 == 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x039f, code lost:
    
        r0 = r0.substring(0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03a3, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03a5, code lost:
    
        r0 = "/";
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01ea, code lost:
    
        if (r0.equals(r15) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01f1, code lost:
    
        if (r0.endsWith(r15) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0204, code lost:
    
        if (r0.charAt((r0.length() - r15.length()) - 1) != '.') goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0210, code lost:
    
        if (jg.b.f19205h.matcher(r0).matches() != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01bc, code lost:
    
        if (r19 == (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01c5, code lost:
    
        if (r19 > 9223372036854775L) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01c7, code lost:
    
        r30 = r19 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01cb, code lost:
    
        r30 = r10 + r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01cf, code lost:
    
        if (r30 < r10) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01d3, code lost:
    
        if (r30 <= 253402300799999L) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01d6, code lost:
    
        r19 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01d9, code lost:
    
        r19 = 253402300799999L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01dc, code lost:
    
        r19 = r28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(ig.b r34, ig.n r35, ig.l r36) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d.d(ig.b, ig.n, ig.l):void");
    }

    public static int e(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}

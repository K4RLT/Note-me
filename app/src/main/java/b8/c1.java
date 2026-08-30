package b8;
import b8.c1;
import j7.f;
import j7.l;
import l.a;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class c1 extends ve.i implements df.p {
    public int A;
    public int B;
    public int C;
    public String D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public Object L;
    public Object M;
    public Object N;
    public Object O;
    public final /* synthetic */ Object P;
    public Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ pe.d S;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1900u = 0;

    /* renamed from: v, reason: collision with root package name */
    public File f1901v;

    /* renamed from: w, reason: collision with root package name */
    public df.p f1902w;

    /* renamed from: x, reason: collision with root package name */
    public File f1903x;

    /* renamed from: y, reason: collision with root package name */
    public File f1904y;

    /* renamed from: z, reason: collision with root package name */
    public int f1905z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(l lVar, String str, Context context, f fVar, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.P = lVar;
        this.D = str;
        this.Q = context;
        this.R = fVar;
        this.S = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0255, code lost:
    
        if (kotlin.jvm.internal.a(r6.f2710d, "notebook") != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x059f A[Catch: all -> 0x00da, TryCatch #3 {all -> 0x00da, blocks: (B:16:0x0468, B:19:0x0473, B:22:0x0485, B:25:0x04a0, B:27:0x04bc, B:29:0x04e2, B:33:0x04eb, B:36:0x0564, B:46:0x0462, B:53:0x00c2, B:55:0x03cc, B:57:0x03d4, B:58:0x03d9, B:76:0x011f, B:78:0x0330, B:85:0x015e, B:87:0x01f8, B:89:0x01fc, B:91:0x0206, B:92:0x0208, B:95:0x024d, B:98:0x0260, B:101:0x027c, B:103:0x02ac, B:106:0x02b4, B:108:0x02be, B:110:0x02ca, B:113:0x0593, B:114:0x0598, B:116:0x0599, B:117:0x059e, B:120:0x0259, B:123:0x059f, B:124:0x05a6, B:126:0x0185, B:128:0x01c1, B:130:0x01c5, B:136:0x05a7, B:137:0x05ae, B:139:0x01a0), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0485 A[Catch: all -> 0x00da, TRY_ENTER, TryCatch #3 {all -> 0x00da, blocks: (B:16:0x0468, B:19:0x0473, B:22:0x0485, B:25:0x04a0, B:27:0x04bc, B:29:0x04e2, B:33:0x04eb, B:36:0x0564, B:46:0x0462, B:53:0x00c2, B:55:0x03cc, B:57:0x03d4, B:58:0x03d9, B:76:0x011f, B:78:0x0330, B:85:0x015e, B:87:0x01f8, B:89:0x01fc, B:91:0x0206, B:92:0x0208, B:95:0x024d, B:98:0x0260, B:101:0x027c, B:103:0x02ac, B:106:0x02b4, B:108:0x02be, B:110:0x02ca, B:113:0x0593, B:114:0x0598, B:116:0x0599, B:117:0x059e, B:120:0x0259, B:123:0x059f, B:124:0x05a6, B:126:0x0185, B:128:0x01c1, B:130:0x01c5, B:136:0x05a7, B:137:0x05ae, B:139:0x01a0), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04a0 A[Catch: all -> 0x00da, TryCatch #3 {all -> 0x00da, blocks: (B:16:0x0468, B:19:0x0473, B:22:0x0485, B:25:0x04a0, B:27:0x04bc, B:29:0x04e2, B:33:0x04eb, B:36:0x0564, B:46:0x0462, B:53:0x00c2, B:55:0x03cc, B:57:0x03d4, B:58:0x03d9, B:76:0x011f, B:78:0x0330, B:85:0x015e, B:87:0x01f8, B:89:0x01fc, B:91:0x0206, B:92:0x0208, B:95:0x024d, B:98:0x0260, B:101:0x027c, B:103:0x02ac, B:106:0x02b4, B:108:0x02be, B:110:0x02ca, B:113:0x0593, B:114:0x0598, B:116:0x0599, B:117:0x059e, B:120:0x0259, B:123:0x059f, B:124:0x05a6, B:126:0x0185, B:128:0x01c1, B:130:0x01c5, B:136:0x05a7, B:137:0x05ae, B:139:0x01a0), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d4 A[Catch: all -> 0x00da, TryCatch #3 {all -> 0x00da, blocks: (B:16:0x0468, B:19:0x0473, B:22:0x0485, B:25:0x04a0, B:27:0x04bc, B:29:0x04e2, B:33:0x04eb, B:36:0x0564, B:46:0x0462, B:53:0x00c2, B:55:0x03cc, B:57:0x03d4, B:58:0x03d9, B:76:0x011f, B:78:0x0330, B:85:0x015e, B:87:0x01f8, B:89:0x01fc, B:91:0x0206, B:92:0x0208, B:95:0x024d, B:98:0x0260, B:101:0x027c, B:103:0x02ac, B:106:0x02b4, B:108:0x02be, B:110:0x02ca, B:113:0x0593, B:114:0x0598, B:116:0x0599, B:117:0x059e, B:120:0x0259, B:123:0x059f, B:124:0x05a6, B:126:0x0185, B:128:0x01c1, B:130:0x01c5, B:136:0x05a7, B:137:0x05ae, B:139:0x01a0), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fc A[Catch: all -> 0x00da, TryCatch #3 {all -> 0x00da, blocks: (B:16:0x0468, B:19:0x0473, B:22:0x0485, B:25:0x04a0, B:27:0x04bc, B:29:0x04e2, B:33:0x04eb, B:36:0x0564, B:46:0x0462, B:53:0x00c2, B:55:0x03cc, B:57:0x03d4, B:58:0x03d9, B:76:0x011f, B:78:0x0330, B:85:0x015e, B:87:0x01f8, B:89:0x01fc, B:91:0x0206, B:92:0x0208, B:95:0x024d, B:98:0x0260, B:101:0x027c, B:103:0x02ac, B:106:0x02b4, B:108:0x02be, B:110:0x02ca, B:113:0x0593, B:114:0x0598, B:116:0x0599, B:117:0x059e, B:120:0x0259, B:123:0x059f, B:124:0x05a6, B:126:0x0185, B:128:0x01c1, B:130:0x01c5, B:136:0x05a7, B:137:0x05ae, B:139:0x01a0), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 1483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.c1.j(java.lang.Object):java.lang.Object");
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1900u) {
            case 0:
                c1 c1Var = new c1((d1) this.R, (s4) this.P, (df.r) this.S, this.f1902w, cVar);
                c1Var.N = obj;
                return c1Var;
            default:
                return new c1((l) this.P, this.D, (Context) this.Q, (f) this.R, (df.p) this.S, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1900u) {
            case 0:
                return ((c1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((c1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0167, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0149, code lost:
    
        if (r3 == r8) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ee A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:10:0x0055, B:14:0x05d1, B:16:0x05d7, B:20:0x0603, B:23:0x0613, B:36:0x065a, B:37:0x065d, B:81:0x05bf, B:83:0x05c5, B:95:0x040a, B:97:0x0410, B:99:0x0427, B:102:0x0434, B:106:0x0460, B:108:0x0470, B:120:0x04e4, B:121:0x04e7, B:127:0x03e8, B:129:0x03ee, B:130:0x0506, B:132:0x050d, B:135:0x0120, B:138:0x03df, B:150:0x01c8, B:151:0x0265, B:153:0x026b, B:154:0x0284, B:156:0x028a, B:161:0x029f, B:167:0x02a3, B:169:0x02a7, B:172:0x02ba, B:174:0x02c0, B:176:0x02cb, B:178:0x02f6, B:180:0x02f9, B:184:0x0310, B:186:0x0321, B:188:0x0327, B:190:0x0330, B:192:0x0359, B:194:0x035c, B:198:0x036c, B:200:0x038c, B:104:0x045c, B:117:0x04e2, B:18:0x05ff, B:33:0x0658), top: B:4:0x0012, inners: #0, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0506 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:10:0x0055, B:14:0x05d1, B:16:0x05d7, B:20:0x0603, B:23:0x0613, B:36:0x065a, B:37:0x065d, B:81:0x05bf, B:83:0x05c5, B:95:0x040a, B:97:0x0410, B:99:0x0427, B:102:0x0434, B:106:0x0460, B:108:0x0470, B:120:0x04e4, B:121:0x04e7, B:127:0x03e8, B:129:0x03ee, B:130:0x0506, B:132:0x050d, B:135:0x0120, B:138:0x03df, B:150:0x01c8, B:151:0x0265, B:153:0x026b, B:154:0x0284, B:156:0x028a, B:161:0x029f, B:167:0x02a3, B:169:0x02a7, B:172:0x02ba, B:174:0x02c0, B:176:0x02cb, B:178:0x02f6, B:180:0x02f9, B:184:0x0310, B:186:0x0321, B:188:0x0327, B:190:0x0330, B:192:0x0359, B:194:0x035c, B:198:0x036c, B:200:0x038c, B:104:0x045c, B:117:0x04e2, B:18:0x05ff, B:33:0x0658), top: B:4:0x0012, inners: #0, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x05d7 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #8 {all -> 0x005e, blocks: (B:10:0x0055, B:14:0x05d1, B:16:0x05d7, B:20:0x0603, B:23:0x0613, B:36:0x065a, B:37:0x065d, B:81:0x05bf, B:83:0x05c5, B:95:0x040a, B:97:0x0410, B:99:0x0427, B:102:0x0434, B:106:0x0460, B:108:0x0470, B:120:0x04e4, B:121:0x04e7, B:127:0x03e8, B:129:0x03ee, B:130:0x0506, B:132:0x050d, B:135:0x0120, B:138:0x03df, B:150:0x01c8, B:151:0x0265, B:153:0x026b, B:154:0x0284, B:156:0x028a, B:161:0x029f, B:167:0x02a3, B:169:0x02a7, B:172:0x02ba, B:174:0x02c0, B:176:0x02cb, B:178:0x02f6, B:180:0x02f9, B:184:0x0310, B:186:0x0321, B:188:0x0327, B:190:0x0330, B:192:0x0359, B:194:0x035c, B:198:0x036c, B:200:0x038c, B:104:0x045c, B:117:0x04e2, B:18:0x05ff, B:33:0x0658), top: B:4:0x0012, inners: #0, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0523 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #1 {all -> 0x00f1, blocks: (B:48:0x051d, B:50:0x0523, B:54:0x0553, B:58:0x0563, B:69:0x05b0, B:70:0x05b3, B:89:0x00e7, B:52:0x054f, B:66:0x05ae), top: B:88:0x00e7, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05c5 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:10:0x0055, B:14:0x05d1, B:16:0x05d7, B:20:0x0603, B:23:0x0613, B:36:0x065a, B:37:0x065d, B:81:0x05bf, B:83:0x05c5, B:95:0x040a, B:97:0x0410, B:99:0x0427, B:102:0x0434, B:106:0x0460, B:108:0x0470, B:120:0x04e4, B:121:0x04e7, B:127:0x03e8, B:129:0x03ee, B:130:0x0506, B:132:0x050d, B:135:0x0120, B:138:0x03df, B:150:0x01c8, B:151:0x0265, B:153:0x026b, B:154:0x0284, B:156:0x028a, B:161:0x029f, B:167:0x02a3, B:169:0x02a7, B:172:0x02ba, B:174:0x02c0, B:176:0x02cb, B:178:0x02f6, B:180:0x02f9, B:184:0x0310, B:186:0x0321, B:188:0x0327, B:190:0x0330, B:192:0x0359, B:194:0x035c, B:198:0x036c, B:200:0x038c, B:104:0x045c, B:117:0x04e2, B:18:0x05ff, B:33:0x0658), top: B:4:0x0012, inners: #0, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0410 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:10:0x0055, B:14:0x05d1, B:16:0x05d7, B:20:0x0603, B:23:0x0613, B:36:0x065a, B:37:0x065d, B:81:0x05bf, B:83:0x05c5, B:95:0x040a, B:97:0x0410, B:99:0x0427, B:102:0x0434, B:106:0x0460, B:108:0x0470, B:120:0x04e4, B:121:0x04e7, B:127:0x03e8, B:129:0x03ee, B:130:0x0506, B:132:0x050d, B:135:0x0120, B:138:0x03df, B:150:0x01c8, B:151:0x0265, B:153:0x026b, B:154:0x0284, B:156:0x028a, B:161:0x029f, B:167:0x02a3, B:169:0x02a7, B:172:0x02ba, B:174:0x02c0, B:176:0x02cb, B:178:0x02f6, B:180:0x02f9, B:184:0x0310, B:186:0x0321, B:188:0x0327, B:190:0x0330, B:192:0x0359, B:194:0x035c, B:198:0x036c, B:200:0x038c, B:104:0x045c, B:117:0x04e2, B:18:0x05ff, B:33:0x0658), top: B:4:0x0012, inners: #0, #3, #5, #6 }] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x04b6 -> B:82:0x04c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x04d3 -> B:83:0x04d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x03ee -> B:85:0x040a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x064a -> B:12:0x064f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x05a0 -> B:40:0x05a3). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, s4 s4Var, df.r rVar, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.R = d1Var;
        this.P = s4Var;
        this.S = rVar;
        this.f1902w = pVar;
    }
}

package b8;
import b1.h;
import b8.l3;
import c2.c3;
import r0.a1;
import u7.m3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.Set;

/* loaded from: classes.dex */
public final class l3 extends ve.i implements df.p {
    public Object A;
    public Object B;
    public Object C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2353u = 3;

    /* renamed from: v, reason: collision with root package name */
    public int f2354v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2355w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2356x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2357y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2358z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, df.a aVar, a1 a1Var5, te.c cVar) {
        super(2, cVar);
        this.f2356x = a1Var;
        this.f2357y = a1Var2;
        this.f2358z = a1Var3;
        this.A = a1Var4;
        this.B = aVar;
        this.C = a1Var5;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01e5 A[Catch: all -> 0x0126, TryCatch #2 {all -> 0x0126, blocks: (B:8:0x00c3, B:11:0x00d1, B:13:0x0102, B:20:0x0129, B:22:0x0132, B:23:0x0139, B:26:0x0160, B:28:0x0166, B:29:0x016a, B:31:0x017a, B:33:0x017e, B:37:0x0191, B:39:0x019b, B:40:0x01b4, B:42:0x01e5, B:43:0x0201, B:45:0x020a, B:46:0x0212, B:51:0x0252, B:54:0x0258, B:56:0x025c, B:61:0x0269, B:67:0x024c, B:69:0x0274, B:48:0x0233, B:50:0x023f), top: B:7:0x00c3, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0201 A[Catch: all -> 0x0126, TryCatch #2 {all -> 0x0126, blocks: (B:8:0x00c3, B:11:0x00d1, B:13:0x0102, B:20:0x0129, B:22:0x0132, B:23:0x0139, B:26:0x0160, B:28:0x0166, B:29:0x016a, B:31:0x017a, B:33:0x017e, B:37:0x0191, B:39:0x019b, B:40:0x01b4, B:42:0x01e5, B:43:0x0201, B:45:0x020a, B:46:0x0212, B:51:0x0252, B:54:0x0258, B:56:0x025c, B:61:0x0269, B:67:0x024c, B:69:0x0274, B:48:0x0233, B:50:0x023f), top: B:7:0x00c3, outer: #1, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l3.j(java.lang.Object):java.lang.Object");
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2353u) {
            case 0:
                l3 l3Var = new l3((u3) this.f2356x, (String) this.f2358z, cVar);
                l3Var.C = obj;
                return l3Var;
            case 1:
                return new l3((a1) this.f2356x, (a1) this.f2357y, (a1) this.f2358z, (a1) this.A, (df.a) this.B, (a1) this.C, cVar);
            case 2:
                return new l3((Set) this.f2357y, (u6) this.f2358z, (a1) this.A, (Context) this.B, (m3) this.C, cVar);
            case 3:
                l3 l3Var2 = new l3((ContentResolver) this.f2356x, (Uri) this.f2357y, (c3) this.f2358z, (rf.h) this.A, (Context) this.B, cVar);
                l3Var2.C = obj;
                return l3Var2;
            case 4:
                l3 l3Var3 = new l3((Context) this.A, (String) this.f2358z, cVar);
                l3Var3.C = obj;
                return l3Var3;
            default:
                l3 l3Var4 = new l3((df.a) this.B, cVar);
                l3Var4.A = obj;
                return l3Var4;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2353u) {
            case 0:
                return ((l3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((l3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((l3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((l3) create((sf.h) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((l3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                ((l3) create((sf.h) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0342, code lost:
    
        if (r4 == r3) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03bd, code lost:
    
        if (r0 == r3) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03d5, code lost:
    
        if (r0 == r3) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0247 A[Catch: all -> 0x01fb, TRY_LEAVE, TryCatch #4 {all -> 0x01fb, blocks: (B:116:0x01f5, B:118:0x022c, B:124:0x023f, B:126:0x0247, B:135:0x020d, B:138:0x0223), top: B:109:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fd A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:10:0x0030, B:12:0x00e2, B:18:0x00f8, B:20:0x00fd, B:23:0x0107, B:25:0x011c, B:27:0x0126, B:29:0x0130, B:34:0x0141, B:42:0x0150, B:45:0x015b, B:50:0x016a, B:56:0x0184, B:58:0x018d, B:67:0x01b4, B:68:0x01b7, B:73:0x0055, B:76:0x0072, B:83:0x00b1, B:89:0x00c8, B:98:0x01c7, B:99:0x01ca, B:85:0x00bd, B:88:0x00c5, B:95:0x01c3, B:96:0x01c6, B:87:0x00c1, B:52:0x0179, B:55:0x0181, B:63:0x01b0, B:64:0x01b3), top: B:4:0x0012, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8 A[LOOP:0: B:19:0x00fb->B:47:0x01b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20, types: [h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [h] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x026e -> B:110:0x022c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0318 -> B:141:0x031a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0342 -> B:139:0x0346). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x034d -> B:140:0x034e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0168 -> B:11:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x018b -> B:11:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01a4 -> B:11:0x01a5). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Context context, String str, te.c cVar) {
        super(2, cVar);
        this.A = context;
        this.f2358z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(u3 u3Var, String str, te.c cVar) {
        super(2, cVar);
        this.f2356x = u3Var;
        this.f2358z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(df.a aVar, te.c cVar) {
        super(2, cVar);
        this.B = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Set set, u6 u6Var, a1 a1Var, Context context, m3 m3Var, te.c cVar) {
        super(2, cVar);
        this.f2357y = set;
        this.f2358z = u6Var;
        this.A = a1Var;
        this.B = context;
        this.C = m3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(ContentResolver contentResolver, Uri uri, c3 c3Var, rf.h hVar, Context context, te.c cVar) {
        super(2, cVar);
        this.f2356x = contentResolver;
        this.f2357y = uri;
        this.f2358z = c3Var;
        this.A = hVar;
        this.B = context;
    }
}

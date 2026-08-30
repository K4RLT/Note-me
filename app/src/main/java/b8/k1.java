package b8;
import b8.k1;
import o7.b;
import r0.a1;
import r0.o1;
import u7.b2;
import u7.m3;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k1 extends ve.i implements df.p {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2294u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f2295v;

    /* renamed from: w, reason: collision with root package name */
    public int f2296w;

    /* renamed from: x, reason: collision with root package name */
    public Context f2297x;

    /* renamed from: y, reason: collision with root package name */
    public m3 f2298y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2299z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(ArrayList arrayList, b2 b2Var, Context context, m3 m3Var, int i, b bVar, Uri uri, te.c cVar) {
        super(2, cVar);
        this.f2299z = arrayList;
        this.A = b2Var;
        this.f2297x = context;
        this.f2298y = m3Var;
        this.f2296w = i;
        this.B = bVar;
        this.C = uri;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2294u) {
            case 0:
                k1 k1Var = new k1(this.f2298y, (String) this.B, this.f2297x, (String) this.C, this.f2296w, cVar);
                k1Var.A = obj;
                return k1Var;
            case 1:
                return new k1((u6) this.B, (a1) this.C, this.f2297x, this.f2298y, cVar);
            case 2:
                return new k1((ArrayList) this.f2299z, (b2) this.A, this.f2297x, this.f2298y, this.f2296w, (b) this.B, (Uri) this.C, cVar);
            default:
                return new k1((ArrayList) this.A, (m3) this.B, (Context) this.C, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2294u) {
            case 0:
                return ((k1) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((k1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((k1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((k1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x011c, code lost:
    
        if (r2 == r9) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165 A[Catch: all -> 0x0152, TryCatch #2 {all -> 0x0152, blocks: (B:38:0x0123, B:47:0x013a, B:40:0x0165, B:41:0x0171, B:67:0x0161, B:68:0x0164, B:75:0x0120, B:64:0x015f, B:43:0x012f, B:46:0x0137, B:59:0x015b, B:60:0x015e), top: B:74:0x0120, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0241 -> B:106:0x0245). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(u6 u6Var, a1 a1Var, Context context, m3 m3Var, te.c cVar) {
        super(2, cVar);
        this.B = u6Var;
        this.C = a1Var;
        this.f2297x = context;
        this.f2298y = m3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(ArrayList arrayList, m3 m3Var, Context context, te.c cVar) {
        super(2, cVar);
        this.A = arrayList;
        this.B = m3Var;
        this.C = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m3 m3Var, String str, Context context, String str2, int i, te.c cVar) {
        super(2, cVar);
        this.f2298y = m3Var;
        this.B = str;
        this.f2297x = context;
        this.C = str2;
        this.f2296w = i;
    }
}

package u7;
import b1.y;
import q.d;
import r2.m;
import u7.x4;

import java.util.List;

/* loaded from: classes.dex */
public final class x4 extends ve.i implements df.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ o1 B;
    public final /* synthetic */ List C;
    public final /* synthetic */ d D;
    public final /* synthetic */ String E;
    public final /* synthetic */ y F;
    public final /* synthetic */ y G;
    public final /* synthetic */ d H;

    /* renamed from: u, reason: collision with root package name */
    public pf.r1 f27026u;

    /* renamed from: v, reason: collision with root package name */
    public float f27027v;

    /* renamed from: w, reason: collision with root package name */
    public int f27028w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f27029x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f27030y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d f27031z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(d dVar, d dVar2, boolean z3, o1 o1Var, List list, d dVar3, String str, y yVar, y yVar2, d dVar4, te.c cVar) {
        super(2, cVar);
        this.f27030y = dVar;
        this.f27031z = dVar2;
        this.A = z3;
        this.B = o1Var;
        this.C = list;
        this.D = dVar3;
        this.E = str;
        this.F = yVar;
        this.G = yVar2;
        this.H = dVar4;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        x4 x4Var = new x4(this.f27030y, this.f27031z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, cVar);
        x4Var.f27029x = obj;
        return x4Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x4) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0174, code lost:
    
        if (m(r20) != r12) goto L71;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x0025, B:8:0x0177, B:13:0x0031, B:14:0x0167, B:18:0x0038, B:19:0x0134, B:24:0x003f, B:25:0x0115, B:28:0x0044, B:29:0x00a2, B:30:0x00a8, B:32:0x00ae, B:38:0x00c5, B:40:0x00d3, B:42:0x00e5, B:43:0x00f7, B:47:0x00de, B:34:0x00bf, B:50:0x0048, B:51:0x0072, B:53:0x0076, B:54:0x007b, B:56:0x0081, B:61:0x0096, B:58:0x0092, B:66:0x004c, B:67:0x0060, B:71:0x0053), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x0025, B:8:0x0177, B:13:0x0031, B:14:0x0167, B:18:0x0038, B:19:0x0134, B:24:0x003f, B:25:0x0115, B:28:0x0044, B:29:0x00a2, B:30:0x00a8, B:32:0x00ae, B:38:0x00c5, B:40:0x00d3, B:42:0x00e5, B:43:0x00f7, B:47:0x00de, B:34:0x00bf, B:50:0x0048, B:51:0x0072, B:53:0x0076, B:54:0x007b, B:56:0x0081, B:61:0x0096, B:58:0x0092, B:66:0x004c, B:67:0x0060, B:71:0x0053), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x0025, B:8:0x0177, B:13:0x0031, B:14:0x0167, B:18:0x0038, B:19:0x0134, B:24:0x003f, B:25:0x0115, B:28:0x0044, B:29:0x00a2, B:30:0x00a8, B:32:0x00ae, B:38:0x00c5, B:40:0x00d3, B:42:0x00e5, B:43:0x00f7, B:47:0x00de, B:34:0x00bf, B:50:0x0048, B:51:0x0072, B:53:0x0076, B:54:0x007b, B:56:0x0081, B:61:0x0096, B:58:0x0092, B:66:0x004c, B:67:0x0060, B:71:0x0053), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x0025, B:8:0x0177, B:13:0x0031, B:14:0x0167, B:18:0x0038, B:19:0x0134, B:24:0x003f, B:25:0x0115, B:28:0x0044, B:29:0x00a2, B:30:0x00a8, B:32:0x00ae, B:38:0x00c5, B:40:0x00d3, B:42:0x00e5, B:43:0x00f7, B:47:0x00de, B:34:0x00bf, B:50:0x0048, B:51:0x0072, B:53:0x0076, B:54:0x007b, B:56:0x0081, B:61:0x0096, B:58:0x0092, B:66:0x004c, B:67:0x0060, B:71:0x0053), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x0025, B:8:0x0177, B:13:0x0031, B:14:0x0167, B:18:0x0038, B:19:0x0134, B:24:0x003f, B:25:0x0115, B:28:0x0044, B:29:0x00a2, B:30:0x00a8, B:32:0x00ae, B:38:0x00c5, B:40:0x00d3, B:42:0x00e5, B:43:0x00f7, B:47:0x00de, B:34:0x00bf, B:50:0x0048, B:51:0x0072, B:53:0x0076, B:54:0x007b, B:56:0x0081, B:61:0x0096, B:58:0x0092, B:66:0x004c, B:67:0x0060, B:71:0x0053), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0070  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.x4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

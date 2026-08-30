package u7;
import q.d;
import r0.a1;
import r0.f1;
import u7.z5;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class z5 extends ve.i implements df.p {
    public final /* synthetic */ Context A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27101u = 1;

    /* renamed from: v, reason: collision with root package name */
    public m3 f27102v;

    /* renamed from: w, reason: collision with root package name */
    public int f27103w;

    /* renamed from: x, reason: collision with root package name */
    public int f27104x;

    /* renamed from: y, reason: collision with root package name */
    public int f27105y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f27106z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(d dVar, int i, m3 m3Var, Context context, int i10, a1 a1Var, f1 f1Var, f1 f1Var2, f1 f1Var3, te.c cVar) {
        super(2, cVar);
        this.B = dVar;
        this.f27105y = i;
        this.f27102v = m3Var;
        this.A = context;
        this.f27106z = i10;
        this.C = a1Var;
        this.D = f1Var;
        this.E = f1Var2;
        this.F = f1Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f27101u) {
            case 0:
                return new z5((d) this.B, this.f27105y, this.f27102v, this.A, this.f27106z, (a1) this.C, (f1) this.D, (f1) this.E, (f1) this.F, cVar);
            default:
                File file = (File) this.D;
                m3 m3Var = (m3) this.E;
                return new z5(this.f27106z, this.A, file, (String) this.F, cVar, m3Var);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f27101u) {
            case 0:
                return ((z5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((z5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:10:0x002c, B:12:0x00c5, B:17:0x00c9, B:21:0x0040, B:23:0x00ae, B:28:0x0054, B:30:0x008f, B:32:0x006f, B:34:0x0077, B:38:0x0093, B:40:0x0098, B:41:0x009e, B:47:0x005b), top: B:4:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:10:0x002c, B:12:0x00c5, B:17:0x00c9, B:21:0x0040, B:23:0x00ae, B:28:0x0054, B:30:0x008f, B:32:0x006f, B:34:0x0077, B:38:0x0093, B:40:0x0098, B:41:0x009e, B:47:0x005b), top: B:4:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:10:0x002c, B:12:0x00c5, B:17:0x00c9, B:21:0x0040, B:23:0x00ae, B:28:0x0054, B:30:0x008f, B:32:0x006f, B:34:0x0077, B:38:0x0093, B:40:0x0098, B:41:0x009e, B:47:0x005b), top: B:4:0x0020 }] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0075 -> B:27:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008a -> B:28:0x008f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.z5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(int i, Context context, File file, String str, te.c cVar, m3 m3Var) {
        super(2, cVar);
        this.D = file;
        this.E = m3Var;
        this.f27106z = i;
        this.A = context;
        this.F = str;
    }
}

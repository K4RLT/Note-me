package u7;
import u7.h2;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h2 extends ve.i implements df.p {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ df.p F;
    public final /* synthetic */ y0 G;
    public final /* synthetic */ m3 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Uri L;

    /* renamed from: u, reason: collision with root package name */
    public File f26266u;

    /* renamed from: v, reason: collision with root package name */
    public File f26267v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f26268w;

    /* renamed from: x, reason: collision with root package name */
    public ParcelFileDescriptor f26269x;

    /* renamed from: y, reason: collision with root package name */
    public kotlin.jvm.internal.y f26270y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26271z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, df.p pVar, y0 y0Var, m3 m3Var, int i, int i10, int i11, Uri uri, te.c cVar) {
        super(2, cVar);
        this.E = context;
        this.F = pVar;
        this.G = y0Var;
        this.H = m3Var;
        this.I = i;
        this.J = i10;
        this.K = i11;
        this.L = uri;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        h2 h2Var = new h2(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, cVar);
        h2Var.D = obj;
        return h2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0250 A[PHI: r16
      0x0250: PHI (r16v11 pe.z) = (r16v2 pe.z), (r16v12 pe.z) binds: [B:144:0x0110, B:29:0x024d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200 A[Catch: Exception -> 0x0203, TRY_LEAVE, TryCatch #28 {Exception -> 0x0203, blocks: (B:64:0x01fa, B:66:0x0200), top: B:63:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025a A[Catch: Exception -> 0x025d, TRY_LEAVE, TryCatch #9 {Exception -> 0x025d, blocks: (B:78:0x0254, B:80:0x025a), top: B:77:0x0254 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01a0 -> B:15:0x0041). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

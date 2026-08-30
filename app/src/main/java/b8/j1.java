package b8;
import b8.j1;
import u7.m3;

import android.content.Context;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;

/* loaded from: classes.dex */
public final class j1 extends ve.i implements df.p {
    public final /* synthetic */ Context A;
    public final /* synthetic */ int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2233u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f2234v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f2235w;

    /* renamed from: x, reason: collision with root package name */
    public int f2236x;

    /* renamed from: y, reason: collision with root package name */
    public int f2237y;

    /* renamed from: z, reason: collision with root package name */
    public int f2238z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m3 m3Var, int i, int i10, int i11, Context context, int i12, Engine engine, Texture texture, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f2235w = m3Var;
        this.f2236x = i;
        this.f2237y = i10;
        this.f2238z = i11;
        this.A = context;
        this.B = i12;
        this.C = engine;
        this.D = texture;
        this.E = lVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2233u) {
            case 0:
                j1 j1Var = new j1(this.f2235w, (String) this.D, this.A, (String) this.E, this.B, cVar);
                j1Var.C = obj;
                return j1Var;
            default:
                return new j1(this.f2235w, this.f2236x, this.f2237y, this.f2238z, this.A, this.B, (Engine) this.C, (Texture) this.D, (df.l) this.E, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2233u) {
            case 0:
                return ((j1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((j1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|(1:(1:(3:7|8|9)(2:11|12))(1:13))(2:31|(1:33))|14|15|16|17|18|19|20|(1:22)|8|9) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:34|(1:(1:37)(2:55|56))(10:57|58|59|60|(1:62)|63|(1:65)(1:76)|(1:67)(1:75)|68|(2:70|(1:73)(1:72))(11:74|39|40|41|42|(1:44)|45|(1:47)|(1:49)|50|51))|38|39|40|41|42|(0)|45|(0)|(0)|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        r0 = (android.graphics.Bitmap) r3.f19787u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        r3.f19787u = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0160, code lost:
    
        r0 = new pe.k(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m3 m3Var, String str, Context context, String str2, int i, te.c cVar) {
        super(2, cVar);
        this.f2235w = m3Var;
        this.D = str;
        this.A = context;
        this.E = str2;
        this.B = i;
    }
}

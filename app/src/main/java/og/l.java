package og;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f22025w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ sg.f f22026x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f22027y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f22028z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Object[] objArr, int i, sg.f fVar, int i10, boolean z3) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f22028z = rVar;
        this.f22025w = i;
        this.f22026x = fVar;
        this.f22027y = i10;
    }

    @Override // jg.a
    public final void b() {
        try {
            z zVar = this.f22028z.D;
            sg.f fVar = this.f22026x;
            int i = this.f22027y;
            zVar.getClass();
            fVar.skip(i);
            this.f22028z.L.r(this.f22025w, 6);
            synchronized (this.f22028z) {
                this.f22028z.N.remove(Integer.valueOf(this.f22025w));
            }
        } catch (IOException unused) {
        }
    }
}

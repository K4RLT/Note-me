package b8;
import z7.m;

/* loaded from: classes.dex */
public final /* synthetic */ class b8 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1884u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f1885v;

    public /* synthetic */ b8(int i, df.l lVar) {
        this.f1884u = i;
        this.f1885v = lVar;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f1884u) {
            case 0:
                this.f1885v.invoke(o5.TAPES);
                break;
            case 1:
                this.f1885v.invoke(o5.ACCESSORIES);
                break;
            case 2:
                this.f1885v.invoke(o5.FRAMES);
                break;
            case 3:
                this.f1885v.invoke(o5.STICKERS);
                break;
            case 4:
                this.f1885v.invoke(o5.NOTEBOOKS);
                break;
            case 5:
                this.f1885v.invoke("frames");
                break;
            case 6:
                this.f1885v.invoke("fills");
                break;
            case 7:
                this.f1885v.invoke("shapes");
                break;
            case 8:
                this.f1885v.invoke("recents");
                break;
            case 9:
                this.f1885v.invoke("gallery");
                break;
            case 10:
                this.f1885v.invoke("stickers");
                break;
            case 11:
                this.f1885v.invoke(2);
                break;
            case 12:
                this.f1885v.invoke(1);
                break;
            default:
                this.f1885v.invoke(m.QUICK_START);
                break;
        }
        return pe.z.f22715a;
    }
}

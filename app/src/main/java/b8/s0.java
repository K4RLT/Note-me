package b8;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2691u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ File f2692v;

    public /* synthetic */ s0(File file, int i) {
        this.f2691u = i;
        this.f2692v = file;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f2691u;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                return new File(this.f2692v, intValue + ".jpg");
            default:
                return new File(this.f2692v, intValue + ".jpg");
        }
    }
}

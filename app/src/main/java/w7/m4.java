package w7;

import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28718u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28719v;

    public /* synthetic */ m4(int i, Object obj) {
        this.f28718u = i;
        this.f28719v = obj;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f28718u) {
            case 0:
                ((m0) this.f28719v).invoke();
                return pe.z.f22715a;
            case 1:
                ((r0) this.f28719v).invoke();
                return pe.z.f22715a;
            case 2:
                return new FileInputStream((File) this.f28719v);
            case 3:
                return Float.valueOf(wa.b9.d(((g7.c) ((g7.h) this.f28719v)).f17561a, 0.02f, 1.0f));
            default:
                return (Float) this.f28719v;
        }
    }
}

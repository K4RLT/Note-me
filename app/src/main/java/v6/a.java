package v6;

import java.util.List;
import r6.f;
import r6.h;
import r6.l;

/* loaded from: classes.dex */
public final class a extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27384w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, List list) {
        super(5, list);
        this.f27384w = i;
    }

    @Override // v6.e
    public final r6.e b() {
        switch (this.f27384w) {
            case 0:
                return new f(0, (List) this.f3443v);
            case 1:
                return new h(0, (List) this.f3443v);
            case 2:
                return new f(2, (List) this.f3443v);
            case 3:
                return new h(1, (List) this.f3443v);
            case 4:
                return new h(2, (List) this.f3443v);
            case 5:
                return new l((List) this.f3443v);
            default:
                return new f(3, (List) this.f3443v);
        }
    }
}

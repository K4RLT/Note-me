package r;
import r.c1;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class e1 implements c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f24061b = new e1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f24062c = new e1(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24063a;

    public /* synthetic */ e1(int i) {
        this.f24063a = i;
    }

    @Override // c1
    public final boolean a() {
        switch (this.f24063a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // c1
    public final b1 b(View view, y2.c cVar) {
        switch (this.f24063a) {
            case 0:
                return new d1(new Magnifier(view));
            default:
                return new d1(new Magnifier(view));
        }
    }
}

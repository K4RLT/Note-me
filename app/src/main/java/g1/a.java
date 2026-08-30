package g1;

import a0.k0;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import b2.b1;
import b2.i2;
import b2.l;
import d1.q;
import g1.a;
import z5.h;

/* loaded from: classes.dex */
public final class a implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final f f17375a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f17376b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f17377c;

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.f, d1.q] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        q qVar = new q();
        qVar.K = 0L;
        this.f17375a = qVar;
        this.f17376b = new n.f(0);
        this.f17377c = new b1() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // b2.b1
            public final q f() {
                return a.this.f17375a;
            }

            @Override // b2.b1
            public final /* bridge */ /* synthetic */ void g(q qVar2) {
            }

            public final int hashCode() {
                return a.this.f17375a.hashCode();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        h hVar = new h(15, dragEvent);
        int action = dragEvent.getAction();
        i2 i2Var = i2.f1501u;
        n.f fVar = this.f17376b;
        f fVar2 = this.f17375a;
        switch (action) {
            case 1:
                Object obj = new Object();
                e eVar = new e(hVar, fVar2, obj);
                if (eVar.invoke(fVar2) == i2Var) {
                    l.y(fVar2, eVar);
                }
                boolean z3 = obj.f19783u;
                fVar.getClass();
                n.a aVar = new n.a(fVar);
                while (aVar.hasNext()) {
                    ((f) aVar.next()).c1();
                }
                return z3;
            case 2:
                fVar2.b1(hVar);
                return false;
            case 3:
                return fVar2.Y0();
            case 4:
                k0 k0Var = new k0(18, hVar);
                if (k0Var.invoke(fVar2) == i2Var) {
                    l.y(fVar2, k0Var);
                }
                fVar.clear();
                return false;
            case 5:
                fVar2.Z0();
                return false;
            case 6:
                fVar2.a1();
                return false;
            default:
                return false;
        }
    }
}
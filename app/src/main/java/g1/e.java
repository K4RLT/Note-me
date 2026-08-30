package g1;

import b2.i2;
import b2.j2;
import df.l;
import k0.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import pe.z;
import t.g1;
import z5.h;

/* loaded from: classes.dex */
public final class e extends m implements l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17382u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u f17383v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, f fVar, u uVar) {
        super(1);
        this.f17382u = 0;
        this.f17383v = uVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f17382u) {
            case 0:
                f fVar = (f) obj;
                if (!fVar.H) {
                    return i2.f1502v;
                }
                if (fVar.J != null) {
                    y1.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                fVar.J = null;
                u uVar = this.f17383v;
                uVar.f19783u = uVar.f19783u;
                return i2.f1501u;
            case 1:
                if (((p) obj).f19387f.f20524a.f20514a.f20477v.length() > 0) {
                    this.f17383v.f19783u = false;
                }
                return z.f22715a;
            case 2:
                j2 j2Var = (j2) obj;
                u uVar2 = this.f17383v;
                if (!uVar2.f19783u) {
                    j2Var.getClass();
                    if (!((g1) j2Var).I) {
                        z3 = false;
                        uVar2.f19783u = z3;
                        return Boolean.valueOf(!z3);
                    }
                }
                z3 = true;
                uVar2.f19783u = z3;
                return Boolean.valueOf(!z3);
            default:
                if (((v1.g) obj).K) {
                    this.f17383v.f19783u = false;
                    return i2.f1503w;
                }
                return i2.f1501u;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(u uVar, int i) {
        super(1);
        this.f17382u = i;
        this.f17383v = uVar;
    }
}

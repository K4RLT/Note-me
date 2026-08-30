package b3;
import s.h;

import android.os.Parcelable;
import android.util.SparseArray;
import b2.x1;
import pe.z;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1668u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f1669v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(s sVar, int i) {
        super(0);
        this.f1668u = i;
        this.f1669v = sVar;
    }

    @Override // df.a
    public final Object invoke() {
        x1 snapshotObserver;
        switch (this.f1668u) {
            case 0:
                this.f1669v.getLayoutNode().C();
                return z.f22715a;
            case 1:
                s sVar = this.f1669v;
                if (sVar.f1674y && sVar.isAttachedToWindow() && sVar.getView().getParent() == sVar) {
                    snapshotObserver = sVar.getSnapshotObserver();
                    snapshotObserver.a(sVar, c.f1643v, sVar.getUpdate());
                }
                return z.f22715a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f1669v.T.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                s sVar2 = this.f1669v;
                sVar2.getReleaseBlock().invoke(sVar2.T);
                h(sVar2);
                return z.f22715a;
            case 4:
                s sVar3 = this.f1669v;
                sVar3.getResetBlock().invoke(sVar3.T);
                return z.f22715a;
            default:
                s sVar4 = this.f1669v;
                sVar4.getUpdateBlock().invoke(sVar4.T);
                return z.f22715a;
        }
    }
}

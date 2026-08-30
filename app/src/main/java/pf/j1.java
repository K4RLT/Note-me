package pf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j1 implements a1 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22758v = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_isCompleting$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22759w = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_rootCause$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22760x = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: u, reason: collision with root package name */
    public final n1 f22761u;

    public j1(n1 n1Var, Throwable th) {
        this.f22761u = n1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b10 = b();
        if (b10 == null) {
            f22759w.set(this, th);
            return;
        }
        if (th != b10) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22760x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                l4.a.n(obj, "State is ");
            }
        }
    }

    public final Throwable b() {
        return (Throwable) f22759w.get(this);
    }

    public final boolean c() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public final ArrayList d(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22760x;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            l4.a.n(obj, "State is ");
            return null;
        }
        Throwable b10 = b();
        if (b10 != null) {
            arrayList.add(0, b10);
        }
        if (th != null && !th.equals(b10)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, b0.f22730h);
        return arrayList;
    }

    @Override // pf.a1
    public final boolean f() {
        if (b() == null) {
            return true;
        }
        return false;
    }

    @Override // pf.a1
    public final n1 g() {
        return this.f22761u;
    }

    public final String toString() {
        boolean z3;
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(c());
        sb2.append(", completing=");
        if (f22758v.get(this) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sb2.append(z3);
        sb2.append(", rootCause=");
        sb2.append(b());
        sb2.append(", exceptions=");
        sb2.append(f22760x.get(this));
        sb2.append(", list=");
        sb2.append(this.f22761u);
        sb2.append(']');
        return sb2.toString();
    }
}

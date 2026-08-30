package uf;
import q.x;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f27229f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final c4.s f27230g = new c4.s("REMOVE_FROZEN", 8);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f27231a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27232b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f27234d;

    public m(int i, boolean z3) {
        this.f27231a = i;
        this.f27232b = z3;
        int i10 = i - 1;
        this.f27233c = i10;
        this.f27234d = new AtomicReferenceArray(i);
        if (i10 <= 1073741823) {
            if ((i & i10) == 0) {
                return;
            }
            x.o("Check failed.");
            throw null;
        }
        x.o("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f27229f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                if ((2305843009213693952L & j10) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & j10);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f27233c;
            if (((i10 + 2) & i11) != (i & i11)) {
                boolean z3 = this.f27232b;
                AtomicReferenceArray atomicReferenceArray = this.f27234d;
                if (!z3 && atomicReferenceArray.get(i10 & i11) != null) {
                    int i12 = this.f27231a;
                    if (i12 < 1024 || ((i10 - i) & 1073741823) > (i12 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f27229f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i10 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i10 & i11, obj);
                        m mVar = this;
                        while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = mVar.f27234d;
                            int i13 = mVar.f27233c & i10;
                            Object obj2 = atomicReferenceArray2.get(i13);
                            if ((obj2 instanceof l) && ((l) obj2).f27228a == i10) {
                                atomicReferenceArray2.set(i13, obj);
                            } else {
                                mVar = null;
                            }
                            if (mVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f27229f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f27229f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f27231a * 2, mVar.f27232b);
            int i = (int) (1073741823 & j10);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i11 = mVar.f27233c;
                int i12 = i & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = mVar.f27234d.get(i12);
                if (obj == null) {
                    obj = new l(i);
                }
                mVar3.f27234d.set(mVar3.f27233c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f27229f;
            long j10 = atomicLongFieldUpdater.get(mVar);
            if ((j10 & 1152921504606846976L) != 0) {
                return f27230g;
            }
            int i = (int) (j10 & 1073741823);
            int i10 = mVar.f27233c;
            int i11 = i & i10;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i10) == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.f27234d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z3 = mVar.f27232b;
            if (obj == null) {
                if (z3) {
                    break;
                }
            } else {
                if (obj instanceof l) {
                    break;
                }
                long j11 = (i + 1) & 1073741823;
                if (f27229f.compareAndSet(mVar, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                mVar = this;
                if (z3) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(mVar);
                        int i12 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f27229f.compareAndSet(mVar2, j12, (j12 & (-1073741824)) | j11)) {
                                mVar2.f27234d.set(i12 & mVar2.f27233c, null);
                                mVar = null;
                            } else {
                                mVar = mVar2;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}

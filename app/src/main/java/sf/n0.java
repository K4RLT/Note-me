package sf;
import l.a;
import n0.b;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n0 extends tf.b implements g, tf.p, l0, z {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25214z = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: y, reason: collision with root package name */
    public int f25215y;

    public n0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // tf.p
    public final g a(te.g gVar, int i, rf.a aVar) {
        if ((((i >= 0 && i < 2) || i == -2) && aVar == rf.a.f24770v) || ((i == 0 || i == -3) && aVar == rf.a.f24769u)) {
            return this;
        }
        return new tf.f(this, gVar, i, aVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
//         jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007c, B:17:0x0084, B:20:0x008b, B:21:0x008f, B:25:0x0092, B:27:0x00b3, B:30:0x00c3, B:31:0x00df, B:37:0x00ef, B:33:0x00e6, B:36:0x00ec, B:46:0x0098, B:49:0x009f, B:57:0x0052, B:59:0x005c, B:60:0x006d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007c, B:17:0x0084, B:20:0x008b, B:21:0x008f, B:25:0x0092, B:27:0x00b3, B:30:0x00c3, B:31:0x00df, B:37:0x00ef, B:33:0x00e6, B:36:0x00ec, B:46:0x0098, B:49:0x009f, B:57:0x0052, B:59:0x005c, B:60:0x006d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c2 -> B:15:0x007c). Please report as a decompilation issue!!! */
    @Override // sf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(sf.h r18, te.c r19) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.b(sf.h, te.c):java.lang.Object");
    }

    @Override // tf.b
    public final tf.d d() {
        return new o0();
    }

    @Override // sf.h
    public final Object e(Object obj, te.c cVar) {
        j(obj);
        return pe.z.f22715a;
    }

    @Override // tf.b
    public final tf.d[] f() {
        return new o0[2];
    }

    @Override // sf.l0
    public final Object getValue() {
        c4.s sVar = tf.c.f25716b;
        Object obj = f25214z.get(this);
        if (obj == sVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        c4.s sVar = tf.c.f25716b;
        if (obj == null) {
            obj = sVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = tf.c.f25716b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        tf.d[] dVarArr;
        c4.s sVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25214z;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f25215y;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.f25215y = i11;
                tf.d[] dVarArr2 = this.f25711u;
                while (true) {
                    o0[] o0VarArr = (o0[]) dVarArr2;
                    if (o0VarArr != null) {
                        for (o0 o0Var : o0VarArr) {
                            if (o0Var != null) {
                                AtomicReference atomicReference = o0Var.f25220a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (sVar = e0.f25167c)) {
                                        c4.s sVar2 = e0.f25166b;
                                        if (obj4 == sVar2) {
                                            while (!atomicReference.compareAndSet(obj4, sVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, sVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((pf.l) obj4).resumeWith(pe.z.f22715a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f25215y;
                        if (i == i11) {
                            this.f25215y = i11 + 1;
                            return true;
                        }
                        dVarArr = this.f25711u;
                    }
                    dVarArr2 = dVarArr;
                    i11 = i;
                }
            } else {
                this.f25215y = i10 + 2;
                return true;
            }
        }
    }
}

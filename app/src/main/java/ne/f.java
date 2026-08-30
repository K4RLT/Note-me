package ne;
import d.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b0.e1;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.t1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import de.h;
import de.j;
import fa.k;
import fa.y;
import i0.m;
import j.m0;
import j6.n;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import ya.ab;
import ya.ag;
import ya.bb;
import ya.bg;
import ya.g;
import ya.g1;
import ya.i;
import ya.ke;
import ya.na;
import ya.ne;
import ya.oa;
import ya.of;
import ya.pf;
import ya.ra;
import ya.sf;
import ya.vf;
import ya.wf;
import ya.xf;
import ya.yd;
import ya.yf;
import ya.za;
import ya.zf;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: k, reason: collision with root package name */
    public static final ca.d[] f21323k = {j.f15849a};

    /* renamed from: l, reason: collision with root package name */
    public static final ge.c f21324l = ge.c.f17749u;

    /* renamed from: d, reason: collision with root package name */
    public final Context f21325d;
    public final me.c e;

    /* renamed from: f, reason: collision with root package name */
    public final pf f21326f;

    /* renamed from: g, reason: collision with root package name */
    public final m f21327g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21328h = true;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public vf f21329j;

    public f(de.f fVar, me.c cVar, pf pfVar, m mVar) {
        y.i(fVar, "MlKitContext can not be null");
        this.f21325d = fVar.b();
        this.e = cVar;
        this.f21326f = pfVar;
        this.f21327g = mVar;
    }

    @Override // de.h
    public final synchronized void d() {
        IInterface ohVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.f21325d;
            ca.d[] dVarArr = f21323k;
            if (!j.a(context, dVarArr)) {
                if (!this.i) {
                    j.b(this.f21325d, dVarArr);
                    this.i = true;
                }
                i(ab.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new zd.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.");
            }
            try {
                if (this.f21329j == null) {
                    IBinder b10 = pa.c(this.f21325d, pa.d.f22621b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i = xf.f31589u;
                    if (b10 == null) {
                        ohVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof yf) {
                            ohVar = (yf) queryLocalInterface;
                        } else {
                            ohVar = new oh(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 6);
                        }
                    }
                    oa.b bVar = new oa.b(this.f21325d);
                    this.e.getClass();
                    me.c cVar = this.e;
                    boolean z3 = cVar.f20797a;
                    cVar.getClass();
                    this.e.getClass();
                    this.f21329j = ((wf) ohVar).u4(bVar, new bg(false, z3, false, false, false));
                }
                try {
                    vf vfVar = this.f21329j;
                    vfVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(vfVar.f9121w);
                    vfVar.T1(obtain, 1);
                    i(ab.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    i(ab.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new zd.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e8) {
                i(ab.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new zd.a("Failed to load subject segmentation module", e8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [j.m0, java.lang.Object] */
    @Override // de.h
    public final synchronized void e() {
        try {
            try {
                vf vfVar = this.f21329j;
                if (vfVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(vfVar.f9121w);
                    vfVar.T1(obtain, 2);
                }
                this.f21329j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.f21328h = true;
            pf pfVar = this.f21326f;
            bb bbVar = bb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
            pfVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (pfVar.d(bbVar, elapsedRealtime)) {
                pfVar.i.put(bbVar, Long.valueOf(elapsedRealtime));
                Object obj = new Object();
                obj.f18664w = za.TYPE_THIN;
                de.m.f15854u.execute(new b9.a(pfVar, new e1((m0) obj, 0), bbVar, pfVar.c()));
            }
        } finally {
            this.f21329j = null;
        }
    }

    public final me.a h(fe.a aVar) {
        Throwable th;
        oa.b bVar;
        f fVar;
        fe.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    vf vfVar = this.f21329j;
                    y.h(vfVar);
                    sf sfVar = new sf(SystemClock.elapsedRealtime(), aVar.f16955d, aVar.f16953b, aVar.f16954c, 0);
                    int i = aVar.f16955d;
                    if (i != -1) {
                        try {
                            if (i != 17) {
                                if (i != 35) {
                                    if (i != 842094169) {
                                        throw new zd.a("Unsupported image format: " + aVar.f16955d);
                                    }
                                } else {
                                    bVar = new oa.b(null);
                                }
                            }
                            y.h(null);
                            throw null;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    Bitmap bitmap = aVar.f16952a;
                    y.h(bitmap);
                    bVar = new oa.b(bitmap);
                    try {
                        ag u42 = vfVar.u4(bVar, sfVar);
                        new ArrayList();
                        this.e.getClass();
                        fVar = this;
                        aVar2 = aVar;
                        try {
                            fVar.j(ab.NO_ERROR, elapsedRealtime, this.f21328h, aVar2, u42);
                            fVar.f21328h = false;
                            float[] fArr = u42.f31024v;
                            if (fArr != null) {
                                FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                allocate.put(fArr);
                                allocate.rewind();
                            }
                            return new me.a(u42.f31025w);
                        } catch (RemoteException e) {
                            e = e;
                            RemoteException remoteException = e;
                            fVar.j(ab.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, fVar.f21328h, aVar2, null);
                            throw new zd.a("Failed to run thin subject segmenter.", remoteException);
                        }
                    } catch (RemoteException e8) {
                        e = e8;
                        fVar = this;
                        aVar2 = aVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ya.of, java.lang.Object, com.google.android.gms.internal.ads.n00] */
    public final void i(ab abVar, long j10) {
        Object obj = new Object();
        obj.f8505b = this;
        obj.f8506c = abVar;
        obj.f8504a = j10;
        this.f21326f.b(obj, bb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void j(final ab abVar, long j10, final boolean z3, final fe.a aVar, final ag agVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f21326f.b(new of() { // from class: ne.e
            /* JADX WARN: Type inference failed for: r0v3, types: [j.m0, java.lang.Object] */
            @Override // ya.of
            public final e1 zza() {
                int i;
                na naVar;
                f fVar = f.this;
                long j11 = elapsedRealtime;
                ab abVar2 = abVar;
                boolean z9 = z3;
                fe.a aVar2 = aVar;
                ag agVar2 = agVar;
                u0 u0Var = new u0(18);
                ya.y yVar = new ya.y(3, false);
                yVar.f31591v = Long.valueOf(j11 & Long.MAX_VALUE);
                yVar.f31592w = abVar2;
                yVar.f31593x = Boolean.valueOf(z9);
                u0Var.f15036v = new ra(yVar);
                int i10 = aVar2.f16955d;
                f.f21324l.getClass();
                int i11 = aVar2.f16955d;
                if (i11 == -1) {
                    Bitmap bitmap = aVar2.f16952a;
                    y.h(bitmap);
                    i = bitmap.getAllocationByteCount();
                } else if (i11 != 17 && i11 != 842094169) {
                    if (i11 != 35) {
                        i = 0;
                    } else {
                        y.h(null);
                        throw null;
                    }
                } else {
                    y.h(null);
                    throw null;
                }
                iw iwVar = new iw(20, false);
                if (i10 != -1) {
                    if (i10 != 35) {
                        if (i10 != 842094169) {
                            if (i10 != 16) {
                                if (i10 != 17) {
                                    naVar = na.UNKNOWN_FORMAT;
                                } else {
                                    naVar = na.NV21;
                                }
                            } else {
                                naVar = na.NV16;
                            }
                        } else {
                            naVar = na.YV12;
                        }
                    } else {
                        naVar = na.YUV_420_888;
                    }
                } else {
                    naVar = na.BITMAP;
                }
                iwVar.f14489v = naVar;
                iwVar.f14490w = Integer.valueOf(i & Integer.MAX_VALUE);
                u0Var.f15037w = new oa(iwVar);
                u0Var.f15038x = fVar.e.a();
                if (agVar2 != null) {
                    List list = agVar2.f31026x;
                    g gVar = i.f31327v;
                    Object[] array = list.toArray();
                    int length = array.length;
                    ke.a(array, length);
                    u0Var.f15040z = i.n(array, length);
                    List<zf> list2 = agVar2.f31023u;
                    if (!list2.isEmpty()) {
                        Object[] objArr = new Object[4];
                        int i12 = 0;
                        for (zf zfVar : list2) {
                            n nVar = new n(12);
                            nVar.f18938v = Integer.valueOf(zfVar.f31626w & Integer.MAX_VALUE);
                            nVar.f18939w = Integer.valueOf(zfVar.f31627x & Integer.MAX_VALUE);
                            nVar.f18940x = Integer.valueOf(zfVar.f31628y & Integer.MAX_VALUE);
                            nVar.f18941y = Integer.valueOf(zfVar.f31629z & Integer.MAX_VALUE);
                            ne neVar = new ne(nVar);
                            int i13 = i12 + 1;
                            int length2 = objArr.length;
                            if (length2 < i13) {
                                int i14 = length2 + (length2 >> 1) + 1;
                                if (i14 < i13) {
                                    int highestOneBit = Integer.highestOneBit(i12);
                                    i14 = highestOneBit + highestOneBit;
                                }
                                if (i14 < 0) {
                                    i14 = Integer.MAX_VALUE;
                                }
                                objArr = Arrays.copyOf(objArr, i14);
                            }
                            objArr[i12] = neVar;
                            i12 = i13;
                        }
                        u0Var.f15039y = i.n(objArr, i12);
                    }
                }
                Object obj = new Object();
                obj.f18664w = za.TYPE_THIN;
                obj.f18667z = new yd(u0Var);
                return new e1((m0) obj, 0);
            }
        }, bb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        ya.y yVar = new ya.y(2, false);
        yVar.f31593x = this.e.a();
        yVar.f31591v = abVar;
        yVar.f31592w = Boolean.valueOf(z3);
        de.m.f15854u.execute(new t1(this.f21326f, new g1(yVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        m mVar = this.f21327g;
        int i = abVar.f31022u;
        synchronized (mVar) {
            AtomicLong atomicLong = (AtomicLong) mVar.f18054v;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - ((AtomicLong) mVar.f18054v).get() <= 1800000) {
                return;
            }
            ((ha.b) mVar.f18055w).d(new fa.n(0, Arrays.asList(new k(24336, i, 0, j11, currentTimeMillis, null, null, 0, -1)))).d(new f3(mVar, elapsedRealtime2, 11));
        }
    }
}
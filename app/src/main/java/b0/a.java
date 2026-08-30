package b0;

import android.os.Handler;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;
import com.google.android.gms.internal.ads.cw1;
import com.google.android.gms.internal.ads.ew1;
import com.google.android.gms.internal.ads.hv1;
import com.google.android.gms.internal.ads.ie0;
import com.google.android.gms.internal.ads.kr1;
import com.google.android.gms.internal.ads.lt0;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.nr1;
import com.google.android.gms.internal.ads.wb;
import com.google.android.gms.internal.ads.xb;
import com.google.android.gms.internal.ads.xv1;
import com.google.android.gms.internal.ads.yb;
import com.google.android.gms.internal.ads.yy;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements ie0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1138u;

    /* renamed from: v, reason: collision with root package name */
    public long f1139v;

    public a(a aVar) {
        this.f1138u = 14;
        this.f1139v = aVar.f1139v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.nr1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.nr1] */
    public long a(ByteBuffer byteBuffer) {
        zb zbVar;
        yb ybVar;
        long j10 = this.f1139v;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            wb wbVar = new wb(new yy(duplicate), zy.f13330c);
            ArrayList arrayList = wbVar.f7859z;
            if (wbVar.f7855v != null && wbVar.f7856w != kr1.A) {
                arrayList = new nr1(arrayList, wbVar);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                zbVar = null;
                if (it.hasNext()) {
                    xb xbVar = (xb) it.next();
                    if (xbVar instanceof yb) {
                        ybVar = (yb) xbVar;
                        break;
                    }
                } else {
                    ybVar = null;
                    break;
                }
            }
            ArrayList arrayList2 = ybVar.f7859z;
            if (ybVar.f7855v != null && ybVar.f7856w != kr1.A) {
                arrayList2 = new nr1(arrayList2, ybVar);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                xb xbVar2 = (xb) it2.next();
                if (xbVar2 instanceof zb) {
                    zbVar = (zb) xbVar2;
                    break;
                }
            }
            long j11 = (zbVar.G * 1000) / zbVar.F;
            this.f1139v = j11;
            return j11;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }

    public void finalize() {
        switch (this.f1138u) {
            case 1:
                long j10 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                ColorGrading.nDestroyBuilder(j10);
                return;
            case 2:
                long j11 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused2) {
                }
                Engine.nDestroyBuilder(j11);
                return;
            case 3:
                long j12 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused3) {
                }
                IndexBuffer.e(j12);
                return;
            case 4:
                long j13 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused4) {
                }
                IndirectLight.c(j13);
                return;
            case 5:
                long j14 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused5) {
                }
                LightManager.nDestroyBuilder(j14);
                return;
            case 6:
                long j15 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused6) {
                }
                RenderableManager.h(j15);
                return;
            case 7:
                long j16 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused7) {
                }
                Texture.nDestroyBuilder(j16);
                return;
            case 8:
                long j17 = this.f1139v;
                try {
                    super.finalize();
                } catch (Throwable unused8) {
                }
                VertexBuffer.f(j17);
                return;
            default:
                super.finalize();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        lt0 lt0Var;
        xv1 xv1Var = (xv1) obj;
        long j10 = this.f1139v;
        cw1 cw1Var = xv1Var.f12639b;
        if (xv1Var.equals(cw1Var.f5194h) && (lt0Var = cw1Var.f5197l) != null) {
            ew1 ew1Var = (ew1) lt0Var.f8135v;
            ew1Var.f5844k1 = true;
            mu muVar = ew1Var.Z0;
            Handler handler = (Handler) muVar.f8422v;
            if (handler != null) {
                handler.post(new hv1(muVar, j10));
            }
        }
    }

    public /* synthetic */ a(long j10, int i) {
        this.f1138u = i;
        this.f1139v = j10;
    }

    public /* synthetic */ a(int i) {
        this.f1138u = i;
    }
}

package a1;
import l.d;
import q.d;

import android.content.Context;
import android.os.Bundle;
import androidx.ink.authoring.compose.InProgressStrokesKt;
import androidx.ink.brush.BrushCoat;
import androidx.ink.brush.TextureBitmapStore;
import androidx.ink.brush.behavior.BinaryOpNode;
import androidx.ink.brush.behavior.EasingFunction;
import androidx.ink.brush.behavior.InterpolationNode;
import androidx.ink.brush.behavior.ResponseNode;
import androidx.ink.brush.behavior.ToolTypeFilterNode;
import androidx.ink.geometry.PartitionedMesh;
import androidx.ink.geometry.Triangle;
import androidx.ink.rendering.android.canvas.CanvasStrokeRenderer;
import androidx.ink.strokes.MeshCreation;
import androidx.ink.strokes.StrokeInputBatch;
import androidx.lifecycle.o0;
import androidx.lifecycle.z0;
import b1.a0;
import b1.b0;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import eg.p0;
import eg.u;
import g5.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import n.j0;
import pe.z;
import q.x;
import r0.i1;
import r0.n2;
import r0.r1;
import r0.u1;
import w7.m0;
import wa.la;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f185u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f186v;

    public /* synthetic */ c(int i, Object obj) {
        this.f185u = i;
        this.f186v = obj;
    }

    @Override // df.a
    public final Object invoke() {
        CanvasStrokeRenderer InProgressStrokesImpl$lambda$4$0;
        Object[] objArr;
        int i;
        boolean z3;
        boolean z9;
        pf.k t3;
        r5.g gVar;
        switch (this.f185u) {
            case 0:
                d dVar = (d) this.f186v;
                s sVar = dVar.f187u;
                Object obj = dVar.f190x;
                if (obj != null) {
                    return sVar.d(dVar, obj);
                }
                x.n("Value should be initialized");
                return null;
            case 1:
                r rVar = (r) this.f186v;
                Bundle a10 = la.a((pe.j[]) Arrays.copyOf(new pe.j[0], 0));
                rVar.f221v.g(a10);
                if (a10.isEmpty()) {
                    return null;
                }
                return a10;
            case 2:
                InProgressStrokesImpl$lambda$4$0 = InProgressStrokesKt.InProgressStrokesImpl$lambda$4$0((TextureBitmapStore) this.f186v);
                return InProgressStrokesImpl$lambda$4$0;
            case 3:
                return Long.valueOf(BrushCoat.b((BrushCoat) this.f186v));
            case 4:
                return Long.valueOf(BinaryOpNode.a((BinaryOpNode.BinaryOp) this.f186v));
            case 5:
                return Long.valueOf(InterpolationNode.a((InterpolationNode.Interpolation) this.f186v));
            case 6:
                return Long.valueOf(ResponseNode.a((EasingFunction) this.f186v));
            case 7:
                return Long.valueOf(ToolTypeFilterNode.a((Set) this.f186v));
            case 8:
                return Long.valueOf(PartitionedMesh.a((Triangle) this.f186v));
            case 9:
                return PartitionedMesh.b((PartitionedMesh) this.f186v);
            case 10:
                return Long.valueOf(MeshCreation.a((StrokeInputBatch) this.f186v));
            case 11:
                return o0.g((z0) this.f186v);
            case 12:
                b0 b0Var = (b0) this.f186v;
                do {
                    synchronized (b0Var.f1312g) {
                        try {
                            if (!b0Var.f1309c) {
                                b0Var.f1309c = true;
                                try {
                                    t0.e eVar = b0Var.f1311f;
                                    Object[] objArr2 = eVar.f25617u;
                                    int i10 = eVar.f25619w;
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        a0 a0Var = (a0) objArr2[i11];
                                        j0 j0Var = a0Var.f1300g;
                                        df.l lVar = a0Var.f1295a;
                                        Object[] objArr3 = j0Var.f20899b;
                                        long[] jArr = j0Var.f20898a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j10 = jArr[i12];
                                                objArr = objArr2;
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8;
                                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                                    int i15 = 0;
                                                    while (i15 < i14) {
                                                        if ((j10 & 255) < 128) {
                                                            i = i13;
                                                            lVar.invoke(objArr3[(i12 << 3) + i15]);
                                                        } else {
                                                            i = i13;
                                                        }
                                                        j10 >>= i;
                                                        i15++;
                                                        i13 = i;
                                                    }
                                                    if (i14 != i13) {
                                                    }
                                                }
                                                if (i12 != length) {
                                                    i12++;
                                                    objArr2 = objArr;
                                                }
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        j0Var.b();
                                        i11++;
                                        objArr2 = objArr;
                                    }
                                    b0Var.f1309c = false;
                                } catch (Throwable th) {
                                    b0Var.f1309c = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } while (b0Var.c());
                return z.f22715a;
            case 13:
                if (((Number) ((d) this.f186v).e()).floatValue() > 0.004f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 14:
                return Float.valueOf(((Number) ((n2) this.f186v).getValue()).floatValue());
            case 15:
                cg.e eVar2 = (cg.e) this.f186v;
                return Integer.valueOf(p0.d(eVar2, eVar2.f4125j));
            case 16:
                Enum[] enumArr = ((u) this.f186v).f16585a;
                eg.t tVar = new eg.t(enumArr.length);
                for (Enum r02 : enumArr) {
                    tVar.k(r02.name(), false);
                }
                return tVar;
            case 17:
                v vVar = ((g5.f) this.f186v).f17437a;
                if (vVar.q() && !vVar.t()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case 18:
                return ((Callable) this.f186v).call();
            case 19:
                de.h hVar = (de.h) this.f186v;
                String c10 = hVar.c();
                v vVar2 = (v) hVar.f15845b;
                vVar2.getClass();
                vVar2.a();
                vVar2.b();
                return vVar2.k().y().k(c10);
            case 20:
                h8.f fVar = (h8.f) this.f186v;
                fVar.getClass();
                fVar.f17935o = true;
                return z.f22715a;
            case gl.zzm /* 21 */:
                return ((gw) this.f186v).j(":memory:");
            case 22:
                i5.s sVar2 = (i5.s) this.f186v;
                return sVar2.f18284u.j(sVar2.f18285v);
            case 23:
                m5.e eVar3 = (m5.e) this.f186v;
                eVar3.g().a(new m5.b(eVar3, 0));
                return z.f22715a;
            case 24:
                return kotlin.jvm.internal.d((Object[]) this.f186v);
            case 25:
                return ((ArrayList) this.f186v).iterator();
            case 26:
                u1 u1Var = (u1) this.f186v;
                synchronized (u1Var.f24396b) {
                    t3 = u1Var.t();
                    if (((r1) u1Var.f24412t.getValue()).compareTo(r1.f24362v) <= 0) {
                        Throwable th3 = u1Var.f24398d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th3);
                        throw cancellationException;
                    }
                }
                if (t3 != null) {
                    ((pf.l) t3).resumeWith(z.f22715a);
                }
                return z.f22715a;
            case 27:
                r5.h hVar2 = (r5.h) this.f186v;
                String str = hVar2.f24572v;
                if (str != null && hVar2.f24574x) {
                    Context context = hVar2.f24571u;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    gVar = new r5.g(hVar2.f24571u, new File(noBackupFilesDir, str).getAbsolutePath(), new ic.c(27), hVar2.f24573w, hVar2.f24575y);
                } else {
                    gVar = new r5.g(hVar2.f24571u, hVar2.f24572v, new ic.c(27), hVar2.f24573w, hVar2.f24575y);
                }
                gVar.setWriteAheadLoggingEnabled(hVar2.A);
                return gVar;
            case 28:
                w2.b bVar = (w2.b) this.f186v;
                i1 i1Var = bVar.f27703w;
                if (((j1.e) i1Var.getValue()).f18774a == 9205357640488583168L || j1.e.e(((j1.e) i1Var.getValue()).f18774a)) {
                    return null;
                }
                return bVar.f27701u.b(((j1.e) i1Var.getValue()).f18774a);
            default:
                ((m0) this.f186v).invoke();
                return z.f22715a;
        }
    }
}

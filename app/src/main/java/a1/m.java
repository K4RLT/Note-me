package a1;
import q.t;

import android.graphics.Mesh;
import android.graphics.MeshSpecification;
import androidx.ink.authoring.internal.CanvasInProgressStrokesRenderHelperV33;
import androidx.ink.authoring.internal.MutableBoxTransformKt;
import androidx.ink.brush.BrushFamily;
import androidx.ink.brush.StockBrushes;
import androidx.ink.geometry.AndroidGraphicsConverter;
import androidx.ink.rendering.android.canvas.internal.CanvasMeshSupport;
import b8.aa;
import b8.i0;
import b8.q0;
import b8.z5;
import b8.z9;
import com.google.android.gms.internal.ads.gl;
import eg.b1;
import eg.g0;
import eg.o0;
import fg.e0;
import java.util.LinkedHashMap;
import pe.z;
import q.x;
import r0.o2;
import sf.n0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f215u;

    public /* synthetic */ m(o0 o0Var) {
        this.f215u = 27;
    }

    @Override // df.a
    public final Object invoke() {
        CanvasInProgressStrokesRenderHelperV33.ScheduledExecutorImpl _init_$lambda$1;
        long _init_$lambda$0;
        MeshSpecification SIMPLE_MESH_SPECIFICATION_delegate$lambda$0;
        Mesh SIMPLE_MESH_delegate$lambda$0;
        int i = this.f215u;
        z zVar = z.f22715a;
        switch (i) {
            case 0:
                return new l(new LinkedHashMap());
            case 1:
                o2 o2Var = q.f219a;
                return null;
            case 2:
                _init_$lambda$1 = CanvasInProgressStrokesRenderHelperV33._init_$lambda$1();
                return _init_$lambda$1;
            case 3:
                return MutableBoxTransformKt.a();
            case 4:
                _init_$lambda$0 = BrushFamily.InputModel.SlidingWindowModel._init_$lambda$0();
                return Long.valueOf(_init_$lambda$0);
            case 5:
                return Long.valueOf(StockBrushes.f());
            case 6:
                return Long.valueOf(StockBrushes.b());
            case 7:
                return StockBrushes.j();
            case 8:
                return StockBrushes.e();
            case 9:
                return StockBrushes.k();
            case 10:
                return StockBrushes.i();
            case 11:
                return Long.valueOf(StockBrushes.a());
            case 12:
                return Long.valueOf(StockBrushes.h());
            case 13:
                return AndroidGraphicsConverter.a();
            case 14:
                return AndroidGraphicsConverter.c();
            case 15:
                return AndroidGraphicsConverter.b();
            case 16:
                SIMPLE_MESH_SPECIFICATION_delegate$lambda$0 = CanvasMeshSupport.SIMPLE_MESH_SPECIFICATION_delegate$lambda$0();
                return SIMPLE_MESH_SPECIFICATION_delegate$lambda$0;
            case 17:
                SIMPLE_MESH_delegate$lambda$0 = CanvasMeshSupport.SIMPLE_MESH_delegate$lambda$0();
                return SIMPLE_MESH_delegate$lambda$0;
            case 18:
                q0 q0Var = q0.f2553a;
                q0.a();
                return zVar;
            case 19:
                return new eg.c(i0.f2183a);
            case 20:
                b1 b1Var = b1.f16494a;
                return new g0(i0.f2183a);
            case gl.zzm /* 21 */:
                return new eg.c(aa.f1854a);
            case 22:
                t tVar = z9.f3099a;
                return zVar;
            case 23:
                z5 z5Var = z5.f3075a;
                n0 n0Var = z5.f3081h;
                Boolean bool = Boolean.FALSE;
                n0Var.getClass();
                n0Var.k(null, bool);
                return zVar;
            case 24:
                o2 o2Var2 = c1.d.f3447a;
                return null;
            case 25:
                o2 o2Var3 = c1.f.f3449a;
                return null;
            case 26:
                int i10 = e7.b.f15936d;
                return zVar;
            case 27:
                cg.i iVar = cg.i.e;
                cg.d[] dVarArr = new cg.d[0];
                if (!mf.f.u("kotlin.Unit")) {
                    if (!iVar.equals(cg.i.f4134b)) {
                        cg.a aVar = new cg.a("kotlin.Unit");
                        return new cg.e("kotlin.Unit", iVar, aVar.f4106b.size(), qe.k.t(dVarArr), aVar);
                    }
                    x.n("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                } else {
                    x.n("Blank serial names are prohibited");
                }
                return null;
            case 28:
                return e0.f16970b;
            default:
                return fg.x.f17000b;
        }
    }

    public /* synthetic */ m(int i) {
        this.f215u = i;
    }
}

package b0;
import l.b;
import n.i0;
import r0.p0;

import android.graphics.Rect;
import android.view.View;
import c2.w1;
import java.io.File;
import java.util.Comparator;
import qc.p1;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1177u;

    public /* synthetic */ e0(int i) {
        this.f1177u = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1177u) {
            case 0:
                return kotlin.jvm.internal.b(((d0) obj).getIndex(), ((d0) obj2).getIndex());
            case 1:
                b2.i0 i0Var = (b2.i0) obj;
                b2.i0 i0Var2 = (b2.i0) obj2;
                float f10 = i0Var.f1478a0.f1558p.X;
                float f11 = i0Var2.f1478a0.f1558p.X;
                if (f10 == f11) {
                    return kotlin.jvm.internal.b(i0Var.w(), i0Var2.w());
                }
                return Float.compare(f10, f11);
            case 2:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                i0 i0Var3 = w1.f3680d;
                Object g8 = i0Var3.g(view);
                g8.getClass();
                Rect rect = (Rect) g8;
                Object g10 = i0Var3.g(view2);
                g10.getClass();
                Rect rect2 = (Rect) g10;
                int i = rect.top - rect2.top;
                if (i == 0) {
                    return rect.bottom - rect2.bottom;
                }
                return i;
            case 3:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                i0 i0Var4 = w1.f3680d;
                Object g11 = i0Var4.g(view3);
                g11.getClass();
                Rect rect3 = (Rect) g11;
                Object g12 = i0Var4.g(view4);
                g12.getClass();
                Rect rect4 = (Rect) g12;
                int i10 = rect3.left - rect4.left;
                if (i10 == 0) {
                    return (rect3.right - rect4.right) * w1.f3679c;
                }
                return w1.f3679c * i10;
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b10 = bArr[i11];
                    byte b11 = bArr2[i11];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 5:
                pe.j jVar = (pe.j) obj;
                pe.j jVar2 = (pe.j) obj2;
                return (((Number) jVar.f22694v).intValue() - ((Number) jVar.f22693u).intValue()) - (((Number) jVar2.f22694v).intValue() - ((Number) jVar2.f22693u).intValue());
            case 6:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 7:
                return ((qc.f0) ((p1) obj)).f23765a.compareTo(((qc.f0) ((p1) obj2)).f23765a);
            case 8:
                return kotlin.jvm.internal.b(((p0) obj).f24318b, ((p0) obj2).f24318b);
            case 9:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i12 = tc.a.f25689f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
        }
    }
}

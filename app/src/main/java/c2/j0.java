package c2;
import f1.a;
import f1.d;
import j2.i;
import j2.o;
import j2.s;
import n.i0;
import n.k;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* loaded from: classes.dex */
public final class j0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f3560a = new Object();

    public final boolean onClearTranslation(View view) {
        df.a aVar;
        view.getClass();
        d contentCaptureManager$ui_release = ((x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16642z = a.f16630u;
        k d2 = contentCaptureManager$ui_release.d();
        Object[] objArr = d2.f20904c;
        long[] jArr = d2.f20902a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            i0 i0Var = ((o) objArr[(i << 3) + i11]).f18826a.f18823d.f18813u;
                            Object g8 = i0Var.g(s.C);
                            Object obj = null;
                            if (g8 == null) {
                                g8 = null;
                            }
                            if (g8 != null) {
                                Object g10 = i0Var.g(i.f18799m);
                                if (g10 != null) {
                                    obj = g10;
                                }
                                a aVar2 = (a) obj;
                                if (aVar2 != null && (aVar = (df.a) aVar2.f18776b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        df.l lVar;
        view.getClass();
        d contentCaptureManager$ui_release = ((x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16642z = a.f16630u;
        k d2 = contentCaptureManager$ui_release.d();
        Object[] objArr = d2.f20904c;
        long[] jArr = d2.f20902a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            i0 i0Var = ((o) objArr[(i << 3) + i11]).f18826a.f18823d.f18813u;
                            Object g8 = i0Var.g(s.C);
                            Object obj = null;
                            if (g8 == null) {
                                g8 = null;
                            }
                            if (kotlin.jvm.internal.l.a(g8, Boolean.TRUE)) {
                                Object g10 = i0Var.g(i.f18798l);
                                if (g10 != null) {
                                    obj = g10;
                                }
                                a aVar = (a) obj;
                                if (aVar != null && (lVar = (df.l) aVar.f18776b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        df.l lVar;
        view.getClass();
        d contentCaptureManager$ui_release = ((x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16642z = a.f16631v;
        k d2 = contentCaptureManager$ui_release.d();
        Object[] objArr = d2.f20904c;
        long[] jArr = d2.f20902a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            i0 i0Var = ((o) objArr[(i << 3) + i11]).f18826a.f18823d.f18813u;
                            Object g8 = i0Var.g(s.C);
                            Object obj = null;
                            if (g8 == null) {
                                g8 = null;
                            }
                            if (kotlin.jvm.internal.l.a(g8, Boolean.FALSE)) {
                                Object g10 = i0Var.g(i.f18798l);
                                if (g10 != null) {
                                    obj = g10;
                                }
                                a aVar = (a) obj;
                                if (aVar != null && (lVar = (df.l) aVar.f18776b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}

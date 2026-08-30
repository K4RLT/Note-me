package c2;
import i0.b;
import q.e;
import s.i;
import a0.u;
import b0.e0;
import b1.r;
import b2.i0;
import b3.k;
import c2.n0;
import g3.a;
import j1.c;
import j2.f;
import j2.g;
import j2.j;
import j2.n;
import j2.q;
import j2.s;
import j2.v;
import k1.h;
import m2.m0;
import n.d0;
import r0.v0;

import android.R;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import wa.b9;

/* loaded from: classes.dex */
public abstract class n0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f3582a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(n nVar) {
        j k3 = nVar.k();
        return !k3.f18813u.c(s.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View b(android.view.View r4, android.view.View r5, int r6) {
        /*
            r0 = 1
            r1 = -1
            r2 = 0
            if (r6 == r0) goto L33
            r0 = 2
            if (r6 == r0) goto L9
            goto L39
        L9:
            int r6 = r4.getNextFocusForwardId()
            if (r6 != r1) goto L10
            goto L39
        L10:
            u r0 = new u
            r1 = 1
            r0.<init>(r6, r1)
            r6 = r2
        L17:
            android.view.View r6 = i(r4, r0, r6)
            if (r6 != 0) goto L32
            if (r4 != r5) goto L20
            goto L32
        L20:
            android.view.ViewParent r6 = r4.getParent()
            if (r6 == 0) goto L31
            boolean r1 = r6 instanceof android.view.View
            if (r1 != 0) goto L2b
            goto L31
        L2b:
            android.view.View r6 = (android.view.View) r6
            r3 = r6
            r6 = r4
            r4 = r3
            goto L17
        L31:
            return r2
        L32:
            return r6
        L33:
            int r6 = r4.getId()
            if (r6 != r1) goto L3a
        L39:
            return r2
        L3a:
            u r6 = new u
            r0 = 16
            r6.<init>(r5, r0, r4)
            r0 = r2
        L42:
            android.view.View r0 = i(r4, r6, r0)
            if (r0 != 0) goto L5d
            if (r4 != r5) goto L4b
            goto L5d
        L4b:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L5c
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L56
            goto L5c
        L56:
            android.view.View r0 = (android.view.View) r0
            r3 = r0
            r0 = r4
            r4 = r3
            goto L42
        L5c:
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.n0.b(android.view.View, android.view.View, int):android.view.View");
    }

    public static final boolean c(n nVar, Resources resources) {
        boolean z3;
        Object g8 = nVar.f18823d.f18813u.g(s.f18839a);
        String str = null;
        if (g8 == null) {
            g8 = null;
        }
        List list = (List) g8;
        if (list != null) {
            str = (String) qe.l.x(list);
        }
        if (str == null && l(nVar) == null && k(nVar, resources) == null && !j(nVar)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!q.e(nVar) && (nVar.f18823d.f18815w || (nVar.o() && z3))) {
            return true;
        }
        return false;
    }

    public static final void d(View view, ArrayList arrayList, boolean z3) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i;
        int i10;
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z3 || view.isFocusableInTouchMode())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (view instanceof ViewGroup) {
            int size = arrayList.size();
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getDescendantFocusability() == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 && z10) {
                arrayList.add(view);
            }
            if (viewGroup.getDescendantFocusability() != 393216) {
                int childCount = viewGroup.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i11 = 0; i11 < childCount; i11++) {
                    viewArr[i11] = viewGroup.getChildAt(i11);
                }
                d0 d0Var = w1.f3677a;
                if (viewGroup.getLayoutDirection() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e0 e0Var = w1.f3681f;
                d0 d0Var2 = w1.f3677a;
                i0 i0Var = w1.f3680d;
                if (childCount < 2) {
                    i = 0;
                } else {
                    int i12 = childCount - d0Var2.f20856b;
                    i = 0;
                    for (int i13 = 0; i13 < i12; i13++) {
                        d0Var2.a(new Rect());
                    }
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View view2 = viewArr[i14];
                        int i15 = w1.f3678b;
                        w1.f3678b = i15 + 1;
                        Rect rect = (Rect) d0Var2.e(i15);
                        view2.getDrawingRect(rect);
                        viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                        i0Var.m(view2, rect);
                    }
                    e0 e0Var2 = w1.e;
                    e0Var2.getClass();
                    if (childCount > 1) {
                        Arrays.sort(viewArr, e0Var2);
                    }
                    Object g8 = i0Var.g(viewArr[0]);
                    g8.getClass();
                    int i16 = ((Rect) g8).bottom;
                    if (z11) {
                        i10 = -1;
                    } else {
                        i10 = 1;
                    }
                    w1.f3679c = i10;
                    int i17 = 0;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        Object g10 = i0Var.g(viewArr[i18]);
                        g10.getClass();
                        Rect rect2 = (Rect) g10;
                        if (rect2.top >= i16) {
                            if (i18 - i17 > 1) {
                                qe.k.s(viewArr, e0Var, i17, i18);
                            }
                            i16 = rect2.bottom;
                            i17 = i18;
                        } else {
                            i16 = Math.max(i16, rect2.bottom);
                        }
                    }
                    if (childCount - i17 > 1) {
                        qe.k.s(viewArr, e0Var, i17, childCount);
                    }
                    w1.f3678b = 0;
                    i0Var.a();
                }
                for (int i19 = i; i19 < childCount; i19++) {
                    d(viewArr[i19], arrayList, z3);
                }
            }
            if (z9 && !z10 && size == arrayList.size()) {
                arrayList.add(view);
                return;
            }
            return;
        }
        if (z9) {
            arrayList.add(view);
        }
    }

    public static final void e(n nVar, r3.e eVar) {
        j jVar = nVar.f18823d;
        i0 i0Var = jVar.f18813u;
        Object g8 = jVar.f18813u.g(s.f18860x);
        if (g8 == null) {
            g8 = null;
        }
        g gVar = (g) g8;
        if (a(nVar)) {
            if (gVar == null || gVar.f18786a != 8) {
                Object g10 = i0Var.g(i.f18810x);
                if (g10 == null) {
                    g10 = null;
                }
                a aVar = (a) g10;
                if (aVar != null) {
                    eVar.a(new r3.d(null, R.id.accessibilityActionPageUp, aVar.f18775a, null));
                }
                Object g11 = i0Var.g(i.f18812z);
                if (g11 == null) {
                    g11 = null;
                }
                a aVar2 = (a) g11;
                if (aVar2 != null) {
                    eVar.a(new r3.d(null, R.id.accessibilityActionPageDown, aVar2.f18775a, null));
                }
                Object g12 = i0Var.g(i.f18811y);
                if (g12 == null) {
                    g12 = null;
                }
                a aVar3 = (a) g12;
                if (aVar3 != null) {
                    eVar.a(new r3.d(null, R.id.accessibilityActionPageLeft, aVar3.f18775a, null));
                }
                Object g13 = i0Var.g(i.A);
                if (g13 == null) {
                    g13 = null;
                }
                a aVar4 = (a) g13;
                if (aVar4 != null) {
                    eVar.a(new r3.d(null, R.id.accessibilityActionPageRight, aVar4.f18775a, null));
                }
            }
        }
    }

    public static final boolean f(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.d() == v0.f24418w || rVar.d() == v0.f24421z || rVar.d() == v0.f24419x) {
                Object value = rVar.getValue();
                if (value != null) {
                    return f(value);
                }
                return true;
            }
        } else {
            if ((obj instanceof pe.d) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (f3582a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float g(float[] fArr, int i, float[] fArr2, int i10) {
        int i11 = i * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    public static final l2 h(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((l2) arrayList.get(i10)).f3569u == i) {
                return (l2) arrayList.get(i10);
            }
        }
        return null;
    }

    public static final View i(View view, df.l lVar, View view2) {
        View i;
        if (((Boolean) lVar.invoke(view)).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != view2 && (i = i(childAt, lVar, view2)) != null) {
                    return i;
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean j(n nVar) {
        boolean z3;
        Object g8 = nVar.f18823d.f18813u.g(s.I);
        Object obj = null;
        if (g8 == null) {
            g8 = null;
        }
        a aVar = (a) g8;
        i0 i0Var = nVar.f18823d.f18813u;
        Object g10 = i0Var.g(s.f18860x);
        if (g10 == null) {
            g10 = null;
        }
        g gVar = (g) g10;
        if (aVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Object g11 = i0Var.g(s.H);
        if (g11 != null) {
            obj = g11;
        }
        if (((Boolean) obj) != null && (gVar == null || gVar.f18786a != 4)) {
            return true;
        }
        return z3;
    }

    public static final String k(n nVar, Resources resources) {
        float f10;
        int e;
        j jVar = nVar.f18823d;
        j jVar2 = nVar.f18823d;
        Object g8 = jVar.f18813u.g(s.f18840b);
        String str = null;
        if (g8 == null) {
            g8 = null;
        }
        i0 i0Var = jVar2.f18813u;
        Object g10 = i0Var.g(s.I);
        if (g10 == null) {
            g10 = null;
        }
        a aVar = (a) g10;
        Object g11 = i0Var.g(s.f18860x);
        if (g11 == null) {
            g11 = null;
        }
        g gVar = (g) g11;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (g8 == null) {
                            g8 = resources.getString(com.daren.scraply.R.string.indeterminate);
                        }
                    } else {
                        l4.a.o();
                        return null;
                    }
                } else if (gVar != null && gVar.f18786a == 2 && g8 == null) {
                    g8 = resources.getString(com.daren.scraply.R.string.state_off);
                }
            } else if (gVar != null && gVar.f18786a == 2 && g8 == null) {
                g8 = resources.getString(com.daren.scraply.R.string.state_on);
            }
        }
        Object g12 = i0Var.g(s.H);
        if (g12 == null) {
            g12 = null;
        }
        Boolean bool = (Boolean) g12;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f18786a != 4) && g8 == null) {
                if (booleanValue) {
                    g8 = resources.getString(com.daren.scraply.R.string.selected);
                } else {
                    g8 = resources.getString(com.daren.scraply.R.string.not_selected);
                }
            }
        }
        Object g13 = i0Var.g(s.f18841c);
        if (g13 == null) {
            g13 = null;
        }
        f fVar = (f) g13;
        if (fVar != null) {
            if (fVar != f.f18783c) {
                if (g8 == null) {
                    jf.a aVar2 = fVar.f18785b;
                    float f11 = aVar2.f19188b;
                    float f12 = aVar2.f19187a;
                    if (f11 - f12 == 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = (fVar.f18784a - f12) / (f11 - f12);
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (f10 == 0.0f) {
                        e = 0;
                    } else if (f10 == 1.0f) {
                        e = 100;
                    } else {
                        e = b9.e(Math.round(f10 * 100), 1, 99);
                    }
                    g8 = resources.getString(com.daren.scraply.R.string.template_percent, Integer.valueOf(e));
                }
            } else if (g8 == null) {
                g8 = resources.getString(com.daren.scraply.R.string.in_progress);
            }
        }
        v vVar = s.E;
        if (i0Var.c(vVar)) {
            i0 i0Var2 = new n(nVar.f18820a, true, nVar.f18822c, jVar2).k().f18813u;
            Object g14 = i0Var2.g(s.f18839a);
            if (g14 == null) {
                g14 = null;
            }
            Collection collection = (Collection) g14;
            if (collection == null || collection.isEmpty()) {
                Object g15 = i0Var2.g(s.A);
                if (g15 == null) {
                    g15 = null;
                }
                Collection collection2 = (Collection) g15;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g16 = i0Var2.g(vVar);
                    if (g16 == null) {
                        g16 = null;
                    }
                    CharSequence charSequence = (CharSequence) g16;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(com.daren.scraply.R.string.state_empty);
                    }
                }
            }
            g8 = str;
        }
        return (String) g8;
    }

    public static final g l(n nVar) {
        Object g8 = nVar.f18823d.f18813u.g(s.E);
        g gVar = null;
        if (g8 == null) {
            g8 = null;
        }
        g gVar2 = (g) g8;
        Object g10 = nVar.f18823d.f18813u.g(s.A);
        if (g10 == null) {
            g10 = null;
        }
        List list = (List) g10;
        if (list != null) {
            gVar = (g) qe.l.x(list);
        }
        if (gVar2 == null) {
            return gVar;
        }
        return gVar2;
    }

    public static boolean m() {
        Object obj;
        Method method;
        try {
            if (x.f3682b1 == null) {
                x.f3682b1 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (x.f3683c1 == null) {
                Class cls = x.f3682b1;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                x.f3683c1 = method;
            }
            Method method2 = x.f3683c1;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            return kotlin.jvm.internal.l.a(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final m0 n(j jVar) {
        df.l lVar;
        ArrayList arrayList = new ArrayList();
        Object g8 = jVar.f18813u.g(i.f18789a);
        if (g8 == null) {
            g8 = null;
        }
        a aVar = (a) g8;
        if (aVar == null || (lVar = (df.l) aVar.f18776b) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (m0) arrayList.get(0);
    }

    public static final boolean o(float[] fArr, float[] fArr2) {
        boolean z3;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = a.y(f17, f35, (f15 * f37) - (f16 * f36), f39);
            fArr2[1] = a.w(f13, f35, (f12 * f36) + ((-f11) * f37), f39);
            fArr2[2] = a.y(f25, f29, (f23 * f31) - (f24 * f30), f39);
            fArr2[3] = a.w(f21, f29, (f20 * f30) + ((-f19) * f31), f39);
            float f40 = -f14;
            fArr2[4] = a.w(f17, f33, (f16 * f34) + (f40 * f37), f39);
            fArr2[5] = a.y(f13, f33, (f37 * f10) - (f12 * f34), f39);
            float f41 = -f22;
            fArr2[6] = a.w(f25, f27, (f24 * f28) + (f41 * f31), f39);
            fArr2[7] = a.y(f21, f27, (f18 * f31) - (f20 * f28), f39);
            fArr2[8] = a.y(f17, f32, (f14 * f36) - (f15 * f34), f39);
            fArr2[9] = a.w(f13, f32, (f34 * f11) + ((-f10) * f36), f39);
            fArr2[10] = a.y(f25, f26, (f22 * f30) - (f23 * f28), f39);
            fArr2[11] = a.w(f21, f26, (f28 * f19) + ((-f18) * f30), f39);
            fArr2[12] = a.w(f16, f32, (f15 * f33) + (f40 * f35), f39);
            fArr2[13] = a.y(f12, f32, (f10 * f35) - (f11 * f33), f39);
            fArr2[14] = a.w(f24, f26, (f23 * f27) + (f41 * f29), f39);
            fArr2[15] = a.y(f20, f26, (f18 * f29) - (f19 * f27), f39);
        }
        if (f38 == 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final boolean p(i0 i0Var, float f10, float f11) {
        c cVar = new c(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        h a10 = k.a();
        i0.b(a10, cVar);
        h a11 = k.a();
        a11.i(i0Var, a10, 1);
        boolean isEmpty = a11.f19481a.isEmpty();
        a11.k();
        a10.k();
        return !isEmpty;
    }

    public static final boolean q(long j10, float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        if (((f15 * f15) / (intBitsToFloat2 * intBitsToFloat2)) + ((f14 * f14) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final void r(float[] fArr, float[] fArr2) {
        float g8 = g(fArr2, 0, fArr, 0);
        float g10 = g(fArr2, 0, fArr, 1);
        float g11 = g(fArr2, 0, fArr, 2);
        float g12 = g(fArr2, 0, fArr, 3);
        float g13 = g(fArr2, 1, fArr, 0);
        float g14 = g(fArr2, 1, fArr, 1);
        float g15 = g(fArr2, 1, fArr, 2);
        float g16 = g(fArr2, 1, fArr, 3);
        float g17 = g(fArr2, 2, fArr, 0);
        float g18 = g(fArr2, 2, fArr, 1);
        float g19 = g(fArr2, 2, fArr, 2);
        float g20 = g(fArr2, 2, fArr, 3);
        float g21 = g(fArr2, 3, fArr, 0);
        float g22 = g(fArr2, 3, fArr, 1);
        float g23 = g(fArr2, 3, fArr, 2);
        float g24 = g(fArr2, 3, fArr, 3);
        fArr[0] = g8;
        fArr[1] = g10;
        fArr[2] = g11;
        fArr[3] = g12;
        fArr[4] = g13;
        fArr[5] = g14;
        fArr[6] = g15;
        fArr[7] = g16;
        fArr[8] = g17;
        fArr[9] = g18;
        fArr[10] = g19;
        fArr[11] = g20;
        fArr[12] = g21;
        fArr[13] = g22;
        fArr[14] = g23;
        fArr[15] = g24;
    }

    public static final k s(d1 d1Var, int i) {
        Object obj;
        Iterator<T> it = d1Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((i0) ((Map.Entry) obj).getKey()).f1490v == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (k) entry.getValue();
    }

    public static final String t(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return simpleName + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String u(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}

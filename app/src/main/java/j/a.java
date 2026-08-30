package j;
import b.b;
import c.a;
import j.d;
import j.e;
import q.x;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import b2.d2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.x90;
import g9.c2;
import wa.x7;

/* loaded from: classes.dex */
public abstract class a extends AutoCompleteTextView {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f18608x = {R.attr.popupBackground};

    /* renamed from: u, reason: collision with root package name */
    public final d2 f18609u;

    /* renamed from: v, reason: collision with root package name */
    public final c2 f18610v;

    /* renamed from: w, reason: collision with root package name */
    public final ic.c f18611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [b2.d2, java.lang.Object] */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b bVar;
        b bVar2;
        boolean z3;
        boolean z9;
        String str;
        String str2;
        float f10;
        float f11;
        float f12;
        boolean z10;
        char c10;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        boolean z11;
        int i10;
        int i11;
        int resourceId;
        ColorStateList a10;
        int i12;
        int resourceId2;
        boolean z12;
        ColorStateList colorStateList;
        int resourceId3;
        ColorStateList g8;
        Drawable drawable7;
        int resourceId4;
        int[] iArr = h.a.f17816b;
        Object obj = g0.f18634a;
        if (!(context.getResources() instanceof h0)) {
            context.getResources();
            int i13 = n0.f18668a;
        }
        Context context2 = getContext();
        ThreadLocal threadLocal = f0.f18628a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(h.a.f17817c);
        try {
            if (!obtainStyledAttributes.hasValue(ModuleDescriptor.MODULE_VERSION)) {
                Log.e("ThemeUtils", "View " + getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
            obtainStyledAttributes.recycle();
            Context context3 = getContext();
            boolean z13 = false;
            TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, f18608x, i, 0);
            if (obtainStyledAttributes2.hasValue(0)) {
                if (obtainStyledAttributes2.hasValue(0) && (resourceId4 = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
                    drawable7 = o.c().d(context3, resourceId4);
                } else {
                    drawable7 = obtainStyledAttributes2.getDrawable(0);
                }
                setDropDownBackgroundDrawable(drawable7);
            }
            obtainStyledAttributes2.recycle();
            Object obj2 = new Object();
            obj2.f1436a = -1;
            obj2.f1437b = this;
            PorterDuff.Mode mode = b.f18615b;
            synchronized (b.class) {
                try {
                    if (b.f18616c == null) {
                        b();
                    }
                    bVar = b.f18616c;
                } finally {
                    th = th;
                    while (true) {
                        try {
                            break;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            }
            obj2.f1438c = bVar;
            this.f18609u = obj2;
            Context context4 = getContext();
            int[] iArr2 = h.a.f17820g;
            TypedArray obtainStyledAttributes3 = context4.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            q3.b(this, getContext(), iArr2, attributeSet, obtainStyledAttributes3, i);
            try {
                if (obtainStyledAttributes3.hasValue(0)) {
                    obj2.f1436a = obtainStyledAttributes3.getResourceId(0, -1);
                    b bVar3 = (b) obj2.f1438c;
                    Context context5 = getContext();
                    int i14 = obj2.f1436a;
                    synchronized (bVar3) {
                        g8 = bVar3.f18617a.g(context5, i14);
                    }
                    if (g8 != null) {
                        obj2.b(g8);
                    }
                }
                if (obtainStyledAttributes3.hasValue(1)) {
                    if (!obtainStyledAttributes3.hasValue(1) || (resourceId3 = obtainStyledAttributes3.getResourceId(1, 0)) == 0 || (colorStateList = x7.a(context4, resourceId3)) == null) {
                        colorStateList = obtainStyledAttributes3.getColorStateList(1);
                    }
                    q3.d(this, colorStateList);
                }
                if (obtainStyledAttributes3.hasValue(2)) {
                    q3.e(this, k.a(obtainStyledAttributes3.getInt(2, -1)));
                }
                obtainStyledAttributes3.recycle();
                c2 c2Var = new c2(this);
                this.f18610v = c2Var;
                int[] iArr3 = h.a.f17819f;
                j jVar = (j) c2Var.f17587l;
                Context context6 = getContext();
                synchronized (b.class) {
                    try {
                        if (b.f18616c == null) {
                            b();
                        }
                        bVar2 = b.f18616c;
                    } finally {
                        th = th;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                int[] iArr4 = h.a.f17815a;
                TypedArray obtainStyledAttributes4 = context6.obtainStyledAttributes(attributeSet, iArr4, i, 0);
                q3.b(this, getContext(), iArr4, attributeSet, obtainStyledAttributes4, i);
                int resourceId5 = obtainStyledAttributes4.getResourceId(0, -1);
                if (obtainStyledAttributes4.hasValue(3)) {
                    c2Var.e = c2.c(context6, bVar2, obtainStyledAttributes4.getResourceId(3, 0));
                }
                if (obtainStyledAttributes4.hasValue(1)) {
                    c2Var.f17582f = c2.c(context6, bVar2, obtainStyledAttributes4.getResourceId(1, 0));
                }
                if (obtainStyledAttributes4.hasValue(4)) {
                    c2Var.f17583g = c2.c(context6, bVar2, obtainStyledAttributes4.getResourceId(4, 0));
                }
                if (obtainStyledAttributes4.hasValue(2)) {
                    c2Var.f17584h = c2.c(context6, bVar2, obtainStyledAttributes4.getResourceId(2, 0));
                }
                if (obtainStyledAttributes4.hasValue(5)) {
                    c2Var.i = c2.c(context6, bVar2, obtainStyledAttributes4.getResourceId(5, 0));
                }
                if (obtainStyledAttributes4.hasValue(6)) {
                    c2Var.f17585j = c2.c(context6, bVar2, obtainStyledAttributes4.getResourceId(6, 0));
                }
                obtainStyledAttributes4.recycle();
                boolean z14 = getTransformationMethod() instanceof PasswordTransformationMethod;
                if (resourceId5 != -1) {
                    TypedArray obtainStyledAttributes5 = context6.obtainStyledAttributes(resourceId5, iArr3);
                    i0 i0Var = new i0(context6, obtainStyledAttributes5);
                    if (!z14 && obtainStyledAttributes5.hasValue(14)) {
                        z9 = obtainStyledAttributes5.getBoolean(14, false);
                        z3 = true;
                    } else {
                        z3 = false;
                        z9 = false;
                    }
                    c2Var.d(context6, i0Var);
                    if (obtainStyledAttributes5.hasValue(15)) {
                        str2 = obtainStyledAttributes5.getString(15);
                    } else {
                        str2 = null;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes5.hasValue(13)) {
                        str = obtainStyledAttributes5.getString(13);
                    } else {
                        str = null;
                    }
                    i0Var.A();
                } else {
                    z3 = false;
                    z9 = false;
                    str = null;
                    str2 = null;
                }
                TypedArray obtainStyledAttributes6 = context6.obtainStyledAttributes(attributeSet, iArr3, i, 0);
                i0 i0Var2 = new i0(context6, obtainStyledAttributes6);
                if (!z14 && obtainStyledAttributes6.hasValue(14)) {
                    z9 = obtainStyledAttributes6.getBoolean(14, false);
                    z3 = true;
                }
                boolean z15 = z9;
                str2 = obtainStyledAttributes6.hasValue(15) ? obtainStyledAttributes6.getString(15) : str2;
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 26 && obtainStyledAttributes6.hasValue(13)) {
                    str = obtainStyledAttributes6.getString(13);
                }
                if (i15 >= 28 && obtainStyledAttributes6.hasValue(0) && obtainStyledAttributes6.getDimensionPixelSize(0, -1) == 0) {
                    setTextSize(0, 0.0f);
                }
                c2Var.d(context6, i0Var2);
                i0Var2.A();
                if (!z14 && z3) {
                    setAllCaps(z15);
                }
                Typeface typeface = (Typeface) c2Var.f17588m;
                if (typeface != null) {
                    if (c2Var.f17579b == -1) {
                        setTypeface(typeface, c2Var.f17578a);
                    } else {
                        setTypeface(typeface);
                    }
                }
                if (str != null) {
                    e.d(this, str);
                }
                if (str2 != null) {
                    b(this, d.a(str2));
                }
                Context context7 = jVar.f18645h;
                TypedArray obtainStyledAttributes7 = context7.obtainStyledAttributes(attributeSet, iArr, i, 0);
                a aVar = jVar.f18644g;
                q3.b(aVar, aVar.getContext(), iArr, attributeSet, obtainStyledAttributes7, i);
                if (obtainStyledAttributes7.hasValue(5)) {
                    jVar.f18639a = obtainStyledAttributes7.getInt(5, 0);
                }
                if (obtainStyledAttributes7.hasValue(4)) {
                    f10 = obtainStyledAttributes7.getDimension(4, -1.0f);
                } else {
                    f10 = -1.0f;
                }
                if (obtainStyledAttributes7.hasValue(2)) {
                    f11 = obtainStyledAttributes7.getDimension(2, -1.0f);
                } else {
                    f11 = -1.0f;
                }
                if (obtainStyledAttributes7.hasValue(1)) {
                    f12 = obtainStyledAttributes7.getDimension(1, -1.0f);
                } else {
                    f12 = -1.0f;
                }
                if (obtainStyledAttributes7.hasValue(3) && (resourceId2 = obtainStyledAttributes7.getResourceId(3, 0)) > 0) {
                    c10 = 3;
                    TypedArray obtainTypedArray = obtainStyledAttributes7.getResources().obtainTypedArray(resourceId2);
                    int length = obtainTypedArray.length();
                    int[] iArr5 = new int[length];
                    if (length > 0) {
                        int i16 = 0;
                        while (i16 < length) {
                            iArr5[i16] = obtainTypedArray.getDimensionPixelSize(i16, -1);
                            i16++;
                            z13 = z13;
                        }
                        z10 = z13;
                        int[] a11 = j.a(iArr5);
                        jVar.e = a11;
                        if (a11.length > 0) {
                            z12 = true;
                        } else {
                            z12 = z10 ? 1 : 0;
                        }
                        jVar.f18643f = z12;
                        if (z12) {
                            jVar.f18639a = 1;
                            jVar.f18641c = a11[z10 ? 1 : 0];
                            jVar.f18642d = a11[r8 - 1];
                            jVar.f18640b = -1.0f;
                        }
                    } else {
                        z10 = false;
                    }
                    obtainTypedArray.recycle();
                } else {
                    z10 = false;
                    c10 = 3;
                }
                obtainStyledAttributes7.recycle();
                if (jVar.f18639a == 1) {
                    if (!jVar.f18643f) {
                        DisplayMetrics displayMetrics = context7.getResources().getDisplayMetrics();
                        if (f11 == -1.0f) {
                            i12 = 2;
                            f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                        } else {
                            i12 = 2;
                        }
                        float f13 = f11;
                        float applyDimension = f12 == -1.0f ? TypedValue.applyDimension(i12, 112.0f, displayMetrics) : f12;
                        f10 = f10 == -1.0f ? 1.0f : f10;
                        if (f13 > 0.0f) {
                            if (applyDimension > f13) {
                                if (f10 > 0.0f) {
                                    jVar.f18639a = 1;
                                    jVar.f18641c = f13;
                                    jVar.f18642d = applyDimension;
                                    jVar.f18640b = f10;
                                    jVar.f18643f = z10;
                                } else {
                                    throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
                                }
                            } else {
                                l4.a.i("Maximum auto-size text size (", applyDimension, "px) is less or equal to minimum auto-size text size (", f13, "px)");
                                throw null;
                            }
                        } else {
                            throw new IllegalArgumentException("Minimum auto-size text size (" + f13 + "px) is less or equal to (0px)");
                        }
                    }
                    if (jVar.f18639a == 1 && (!jVar.f18643f || jVar.e.length == 0)) {
                        int floor = ((int) Math.floor((jVar.f18642d - jVar.f18641c) / jVar.f18640b)) + 1;
                        int[] iArr6 = new int[floor];
                        for (int i17 = 0; i17 < floor; i17++) {
                            iArr6[i17] = Math.round((i17 * jVar.f18640b) + jVar.f18641c);
                        }
                        jVar.e = j.a(iArr6);
                    }
                }
                if (o0.f18676a && jVar.f18639a != 0) {
                    int[] iArr7 = jVar.e;
                    if (iArr7.length > 0) {
                        if (e.a(this) != -1.0f) {
                            e.b(this, Math.round(jVar.f18641c), Math.round(jVar.f18642d), Math.round(jVar.f18640b), 0);
                        } else {
                            e.c(this, iArr7, 0);
                        }
                    }
                }
                TypedArray obtainStyledAttributes8 = context6.obtainStyledAttributes(attributeSet, iArr);
                int resourceId6 = obtainStyledAttributes8.getResourceId(8, -1);
                if (resourceId6 != -1) {
                    drawable = bVar2.a(context6, resourceId6);
                } else {
                    drawable = null;
                }
                int resourceId7 = obtainStyledAttributes8.getResourceId(13, -1);
                if (resourceId7 != -1) {
                    drawable2 = bVar2.a(context6, resourceId7);
                } else {
                    drawable2 = null;
                }
                int resourceId8 = obtainStyledAttributes8.getResourceId(9, -1);
                if (resourceId8 != -1) {
                    drawable3 = bVar2.a(context6, resourceId8);
                } else {
                    drawable3 = null;
                }
                int resourceId9 = obtainStyledAttributes8.getResourceId(6, -1);
                if (resourceId9 != -1) {
                    drawable4 = bVar2.a(context6, resourceId9);
                } else {
                    drawable4 = null;
                }
                int resourceId10 = obtainStyledAttributes8.getResourceId(10, -1);
                if (resourceId10 != -1) {
                    drawable5 = bVar2.a(context6, resourceId10);
                } else {
                    drawable5 = null;
                }
                int resourceId11 = obtainStyledAttributes8.getResourceId(7, -1);
                if (resourceId11 != -1) {
                    drawable6 = bVar2.a(context6, resourceId11);
                } else {
                    drawable6 = null;
                }
                if (drawable5 == null && drawable6 == null) {
                    if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                        Drawable[] a12 = c.a(this);
                        Drawable drawable8 = a12[0];
                        if (drawable8 == null && a12[2] == null) {
                            Drawable[] compoundDrawables = getCompoundDrawables();
                            setCompoundDrawablesWithIntrinsicBounds(drawable == null ? compoundDrawables[0] : drawable, drawable2 == null ? compoundDrawables[1] : drawable2, drawable3 == null ? compoundDrawables[2] : drawable3, drawable4 == null ? compoundDrawables[c10] : drawable4);
                        } else {
                            b(this, drawable8, drawable2 == null ? a12[1] : drawable2, a12[2], drawable4 == null ? a12[c10] : drawable4);
                        }
                    }
                } else {
                    Drawable[] a13 = c.a(this);
                    b(this, drawable5 == null ? a13[0] : drawable5, drawable2 == null ? a13[1] : drawable2, drawable6 == null ? a13[2] : drawable6, drawable4 == null ? a13[c10] : drawable4);
                }
                if (obtainStyledAttributes8.hasValue(11)) {
                    setCompoundDrawableTintList((!obtainStyledAttributes8.hasValue(11) || (resourceId = obtainStyledAttributes8.getResourceId(11, 0)) == 0 || (a10 = x7.a(context6, resourceId)) == null) ? obtainStyledAttributes8.getColorStateList(11) : a10);
                }
                int i18 = -1;
                if (obtainStyledAttributes8.hasValue(12)) {
                    setCompoundDrawableTintMode(k.a(obtainStyledAttributes8.getInt(12, -1)));
                }
                int dimensionPixelSize = obtainStyledAttributes8.getDimensionPixelSize(15, -1);
                int dimensionPixelSize2 = obtainStyledAttributes8.getDimensionPixelSize(18, -1);
                int dimensionPixelSize3 = obtainStyledAttributes8.getDimensionPixelSize(19, -1);
                obtainStyledAttributes8.recycle();
                if (dimensionPixelSize != -1) {
                    if (dimensionPixelSize >= 0) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            f3.k.n(this, dimensionPixelSize);
                        } else {
                            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
                            if (getIncludeFontPadding()) {
                                i11 = fontMetricsInt.top;
                            } else {
                                i11 = fontMetricsInt.ascent;
                            }
                            if (dimensionPixelSize > Math.abs(i11)) {
                                setPadding(getPaddingLeft(), dimensionPixelSize + i11, getPaddingRight(), getPaddingBottom());
                            }
                        }
                        i18 = -1;
                    } else {
                        x.m();
                        throw null;
                    }
                }
                if (dimensionPixelSize2 != i18) {
                    if (dimensionPixelSize2 >= 0) {
                        Paint.FontMetricsInt fontMetricsInt2 = getPaint().getFontMetricsInt();
                        if (getIncludeFontPadding()) {
                            i10 = fontMetricsInt2.bottom;
                        } else {
                            i10 = fontMetricsInt2.descent;
                        }
                        if (dimensionPixelSize2 > Math.abs(i10)) {
                            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), dimensionPixelSize2 - i10);
                        }
                        i18 = -1;
                    } else {
                        x.m();
                        throw null;
                    }
                }
                if (dimensionPixelSize3 != i18) {
                    if (dimensionPixelSize3 >= 0) {
                        if (dimensionPixelSize3 != getPaint().getFontMetricsInt(null)) {
                            setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
                        }
                    } else {
                        x.m();
                        throw null;
                    }
                }
                this.f18610v.b();
                ic.c cVar = new ic.c(this);
                this.f18611w = cVar;
                TypedArray obtainStyledAttributes9 = getContext().obtainStyledAttributes(attributeSet, iArr, i, 0);
                try {
                    if (obtainStyledAttributes9.hasValue(14)) {
                        z11 = obtainStyledAttributes9.getBoolean(14, true);
                    } else {
                        z11 = true;
                    }
                    obtainStyledAttributes9.recycle();
                    cVar.B(z11);
                    KeyListener keyListener = getKeyListener();
                    if (!(keyListener instanceof NumberKeyListener)) {
                        boolean isFocusable = super.isFocusable();
                        boolean isClickable = super.isClickable();
                        boolean isLongClickable = super.isLongClickable();
                        int inputType = super.getInputType();
                        KeyListener n10 = cVar.n(keyListener);
                        if (n10 != keyListener) {
                            super.setKeyListener(n10);
                            super.setRawInputType(inputType);
                            super.setFocusable(isFocusable);
                            super.setClickable(isClickable);
                            super.setLongClickable(isLongClickable);
                        }
                    }
                } finally {
                    obtainStyledAttributes9.recycle();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (Throwable th4) {
            obtainStyledAttributes.recycle();
            throw th4;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d2 d2Var = this.f18609u;
        if (d2Var != null) {
            d2Var.a();
        }
        c2 c2Var = this.f18610v;
        if (c2Var != null) {
            c2Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        if ((customSelectionActionModeCallback instanceof u3.a) && Build.VERSION.SDK_INT >= 26) {
            return ((u3.a) customSelectionActionModeCallback).f25846a;
        }
        return customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ig.h hVar;
        d2 d2Var = this.f18609u;
        if (d2Var == null || (hVar = (ig.h) d2Var.e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f18505c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ig.h hVar;
        d2 d2Var = this.f18609u;
        if (d2Var == null || (hVar = (ig.h) d2Var.e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f18506d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ig.h hVar = (ig.h) this.f18610v.f17586k;
        if (hVar != null) {
            return (ColorStateList) hVar.f18505c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        ig.h hVar = (ig.h) this.f18610v.f17586k;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f18506d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        z5.h hVar = (z5.h) this.f18611w.f18393v;
        if (onCreateInputConnection == null) {
            hVar.getClass();
            return null;
        }
        x90 x90Var = (x90) hVar.f31922v;
        x90Var.getClass();
        if (onCreateInputConnection instanceof e4.b) {
            return onCreateInputConnection;
        }
        return new e4.b((a) x90Var.f12502v, onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d2 d2Var = this.f18609u;
        if (d2Var != null) {
            d2Var.f1436a = -1;
            d2Var.b(null);
            d2Var.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        ColorStateList colorStateList;
        super.setBackgroundResource(i);
        d2 d2Var = this.f18609u;
        if (d2Var != null) {
            d2Var.f1436a = i;
            b bVar = (b) d2Var.f1438c;
            if (bVar != null) {
                Context context = ((a) d2Var.f1437b).getContext();
                synchronized (bVar) {
                    colorStateList = bVar.f18617a.g(context, i);
                }
            } else {
                colorStateList = null;
            }
            d2Var.b(colorStateList);
            d2Var.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c2 c2Var = this.f18610v;
        if (c2Var != null) {
            c2Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c2 c2Var = this.f18610v;
        if (c2Var != null) {
            c2Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof u3.a) && callback != null) {
            callback = new u3.a(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(o.c().d(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f18611w.B(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f18611w.n(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d2 d2Var = this.f18609u;
        if (d2Var != null) {
            if (((ig.h) d2Var.e) == null) {
                d2Var.e = new Object();
            }
            ig.h hVar = (ig.h) d2Var.e;
            hVar.f18505c = colorStateList;
            hVar.f18504b = true;
            d2Var.a();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d2 d2Var = this.f18609u;
        if (d2Var != null) {
            if (((ig.h) d2Var.e) == null) {
                d2Var.e = new Object();
            }
            ig.h hVar = (ig.h) d2Var.e;
            hVar.f18506d = mode;
            hVar.f18503a = true;
            d2Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z3;
        c2 c2Var = this.f18610v;
        if (((ig.h) c2Var.f17586k) == null) {
            c2Var.f17586k = new Object();
        }
        ig.h hVar = (ig.h) c2Var.f17586k;
        hVar.f18505c = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        hVar.f18504b = z3;
        c2Var.e = hVar;
        c2Var.f17582f = hVar;
        c2Var.f17583g = hVar;
        c2Var.f17584h = hVar;
        c2Var.i = hVar;
        c2Var.f17585j = hVar;
        c2Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z3;
        c2 c2Var = this.f18610v;
        if (((ig.h) c2Var.f17586k) == null) {
            c2Var.f17586k = new Object();
        }
        ig.h hVar = (ig.h) c2Var.f17586k;
        hVar.f18506d = mode;
        if (mode != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        hVar.f18503a = z3;
        c2Var.e = hVar;
        c2Var.f17582f = hVar;
        c2Var.f17583g = hVar;
        c2Var.f17584h = hVar;
        c2Var.i = hVar;
        c2Var.f17585j = hVar;
        c2Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        String string;
        super.setTextAppearance(context, i);
        c2 c2Var = this.f18610v;
        if (c2Var != null) {
            a aVar = (a) c2Var.f17581d;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, h.a.f17819f);
            i0 i0Var = new i0(context, obtainStyledAttributes);
            if (obtainStyledAttributes.hasValue(14)) {
                aVar.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
            }
            if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
                aVar.setTextSize(0, 0.0f);
            }
            c2Var.d(context, i0Var);
            if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
                e.d(aVar, string);
            }
            i0Var.A();
            Typeface typeface = (Typeface) c2Var.f17588m;
            if (typeface != null) {
                aVar.setTypeface(typeface, c2Var.f17578a);
            }
        }
    }
}
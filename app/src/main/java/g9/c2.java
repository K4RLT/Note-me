package g9;
import b.c;
import c.a;
import f.a;
import j.a;
import j.b;
import j.c;
import j.f;
import j.i0;
import j.j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.ads.l3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17578a;

    /* renamed from: b, reason: collision with root package name */
    public int f17579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17580c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17581d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17582f;

    /* renamed from: g, reason: collision with root package name */
    public Object f17583g;

    /* renamed from: h, reason: collision with root package name */
    public Object f17584h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f17585j;

    /* renamed from: k, reason: collision with root package name */
    public Object f17586k;

    /* renamed from: l, reason: collision with root package name */
    public Object f17587l;

    /* renamed from: m, reason: collision with root package name */
    public Object f17588m;

    public c2() {
        this.f17581d = new HashSet();
        this.f17583g = new Bundle();
        this.i = new HashMap();
        this.e = new HashSet();
        this.f17584h = new Bundle();
        this.f17582f = new HashSet();
        this.f17588m = new ArrayList();
        this.f17578a = -1;
        this.f17579b = 60000;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ig.h, java.lang.Object] */
    public static ig.h c(Context context, b bVar, int i) {
        ColorStateList g8;
        synchronized (bVar) {
            g8 = bVar.f18617a.g(context, i);
        }
        if (g8 != null) {
            Object obj = new Object();
            obj.f18504b = true;
            obj.f18505c = g8;
            return obj;
        }
        return null;
    }

    public void a(Drawable drawable, ig.h hVar) {
        if (drawable != null && hVar != null) {
            b.c(drawable, hVar, ((a) this.f17581d).getDrawableState());
        }
    }

    public void b() {
        a aVar = (a) this.f17581d;
        if (((ig.h) this.e) != null || ((ig.h) this.f17582f) != null || ((ig.h) this.f17583g) != null || ((ig.h) this.f17584h) != null) {
            Drawable[] compoundDrawables = aVar.getCompoundDrawables();
            a(compoundDrawables[0], (ig.h) this.e);
            a(compoundDrawables[1], (ig.h) this.f17582f);
            a(compoundDrawables[2], (ig.h) this.f17583g);
            a(compoundDrawables[3], (ig.h) this.f17584h);
        }
        if (((ig.h) this.i) == null && ((ig.h) this.f17585j) == null) {
            return;
        }
        Drawable[] a10 = c.a(aVar);
        a(a10[0], (ig.h) this.i);
        a(a10[2], (ig.h) this.f17585j);
    }

    public void d(Context context, i0 i0Var) {
        String string;
        boolean z3;
        boolean z9;
        int i = this.f17578a;
        TypedArray typedArray = (TypedArray) i0Var.f18637w;
        this.f17578a = typedArray.getInt(2, i);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f17579b = i11;
            if (i11 != -1) {
                this.f17578a &= 2;
            }
        }
        int i12 = 10;
        boolean z10 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f17580c = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.f17588m = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f17588m = Typeface.SERIF;
                    return;
                }
                this.f17588m = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f17588m = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f17579b;
        int i15 = this.f17578a;
        if (!context.isRestricted()) {
            try {
                Typeface n10 = i0Var.n(i12, this.f17578a, new l3(this, i14, i15, new WeakReference((a) this.f17581d)));
                if (n10 != null) {
                    if (i10 >= 28 && this.f17579b != -1) {
                        Typeface create = Typeface.create(n10, 0);
                        int i16 = this.f17579b;
                        if ((this.f17578a & 2) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.f17588m = f.a(create, i16, z9);
                    } else {
                        this.f17588m = n10;
                    }
                }
                if (((Typeface) this.f17588m) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f17580c = z3;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.f17588m) == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f17579b != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f17579b;
                if ((this.f17578a & 2) == 0) {
                    z10 = false;
                }
                this.f17588m = f.a(create2, i17, z10);
                return;
            }
            this.f17588m = Typeface.create(string, this.f17578a);
        }
    }

    public c2(a aVar) {
        this.f17578a = 0;
        this.f17579b = -1;
        this.f17581d = aVar;
        this.f17587l = new j(aVar);
    }
}
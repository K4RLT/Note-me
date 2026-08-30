package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b4.b;
import g3.a;
import p.a;
import q.x;
import w2.a;
import x.n;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.pd1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14448a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14449b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14450c = new ArrayList();

    public i(z4 z4Var, z4 z4Var2, z4 z4Var3) {
        e4 listIterator = z4Var.listIterator(0);
        while (listIterator.hasNext()) {
            j0 j0Var = (j0) listIterator.next();
            if (TextUtils.isEmpty(j0Var.d())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                j0 j0Var2 = (j0) this.f14448a.put(j0Var.d(), j0Var);
                if (j0Var2 != null) {
                    q.x.n(p.a.l("Cannot override Backend ", j0Var2.getClass().getCanonicalName(), " with ", j0Var.getClass().getCanonicalName()));
                    throw null;
                }
            }
        }
        e4 listIterator2 = z4Var2.listIterator(0);
        while (listIterator2.hasNext()) {
            k0 k0Var = (k0) listIterator2.next();
            if (TextUtils.isEmpty("compress")) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else if (((k0) this.f14449b.put("compress", k0Var)) != null) {
                q.x.n(p.a.l("Cannot to override Transform ", k0.class.getCanonicalName(), " with ", k0Var.getClass().getCanonicalName()));
                throw null;
            }
        }
        this.f14450c.addAll(z4Var3);
    }

    public final long a(Uri uri) {
        g i = i(uri);
        return i.f14346b.f(i.f14349f);
    }

    public final ArrayList b(Uri uri) {
        j0 j10 = j(uri.getScheme());
        h4 k3 = k(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        Iterator it = j10.m(uri.buildUpon().fragment(null).build()).iterator();
        while (it.hasNext()) {
            Uri build = ((Uri) it.next()).buildUpon().encodedFragment(encodedFragment).build();
            if (!k3.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) gn.o(arrayList2);
                    e4 listIterator = k3.listIterator(0);
                    while (listIterator.hasNext()) {
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    public final Object c(Uri uri, h hVar) {
        return hVar.d(i(uri));
    }

    public final void d(Uri uri) {
        g i = i(uri);
        i.f14346b.n(i.f14349f);
    }

    public final void e(Uri uri, Uri uri2) {
        g i = i(uri);
        g i10 = i(uri2);
        j0 j0Var = i.f14346b;
        if (j0Var == i10.f14346b) {
            j0Var.i(i.f14349f, i10.f14349f);
            return;
        }
        throw new IOException("Cannot rename file across backends");
    }

    public final void f(Uri uri) {
        if (!g(uri)) {
            return;
        }
        if (!h(uri)) {
            d(uri);
            return;
        }
        ArrayList b10 = b(uri);
        int size = b10.size();
        int i = 0;
        while (i < size) {
            Object obj = b10.get(i);
            i++;
            f((Uri) obj);
        }
        j(uri.getScheme()).k(uri.buildUpon().fragment(null).build());
    }

    public final boolean g(Uri uri) {
        g i = i(uri);
        return i.f14346b.g(i.f14349f);
    }

    public final boolean h(Uri uri) {
        return j(uri.getScheme()).b(uri.buildUpon().fragment(null).build());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.g] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.g] */
    public final g i(Uri uri) {
        h4 k3 = k(uri);
        com.google.android.gms.internal.mlkit_vision_digital_ink.g obj = new Object();
        obj.f14345a = this;
        obj.f14346b = j(uri.getScheme());
        obj.f14348d = this.f14450c;
        obj.f14347c = k3;
        obj.e = uri;
        if (!k3.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                e4 listIterator = k3.listIterator(k3.size());
                while (listIterator.hasPrevious()) {
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        obj.f14349f = uri;
        Object obj2 = new Object();
        obj2.f14345a = obj.f14345a;
        obj2.f14346b = obj.f14346b;
        obj2.f14347c = obj.f14347c;
        obj2.f14348d = obj.f14348d;
        obj2.e = obj.e;
        obj2.f14349f = obj.f14349f;
        return obj2;
    }

    public final j0 j(String str) {
        j0 j0Var = (j0) this.f14448a.get(str);
        if (j0Var != null) {
            return j0Var;
        }
        throw new IOException(g3.a.k("Requested backend isn't registered: ", str));
    }

    public final h4 k(Uri uri) {
        List list;
        e4 e4Var = h4.f14393v;
        n5.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        n5.d(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            String substring = encodedFragment.substring(10);
            w2 a10 = w2.a("+");
            list = h4.s(new pd1(new w2(a10.f15170c, true, a10.f15168a), substring));
        } else {
            list = z4.f15325y;
        }
        int size = list.size();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            String str = (String) list.get(i10);
            Matcher matcher = e0.f14230a.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                group.getClass();
                int length = objArr2.length;
                int i12 = i11 + 1;
                int b10 = b4.b(length, i12);
                if (b10 > length) {
                    objArr2 = Arrays.copyOf(objArr2, b10);
                }
                objArr2[i11] = group;
                i10++;
                i11 = i12;
            } else {
                q.x.n("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
        }
        z4 r8 = h4.r(objArr2, i11);
        int i13 = r8.f15327x;
        int i14 = 0;
        while (i < i13) {
            String str2 = (String) r8.get(i);
            k0 k0Var = (k0) this.f14449b.get(str2);
            if (k0Var != null) {
                int length2 = objArr.length;
                int i15 = i14 + 1;
                int b11 = b4.b(length2, i15);
                if (b11 > length2) {
                    objArr = Arrays.copyOf(objArr, b11);
                }
                objArr[i14] = k0Var;
                i++;
                i14 = i15;
            } else {
                throw new IOException(p.a.l("Requested transform isn't registered: ", str2, ": ", String.valueOf(uri)));
            }
        }
        return h4.r(objArr, i14).p();
    }
}

package com.google.android.gms.internal.ads;
import g9.f3;
import g9.z2;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class tq0 implements sq0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f11416a;

    public tq0(g9.z2 z2Var, String str, int i, String str2, g9.f3 f3Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(z2Var.f17722v));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(z2Var.f17723w));
        } else if (hashSet.contains("npa")) {
            arrayList.add(z2Var.f17723w.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(z2Var.f17724x));
        }
        if (hashSet.contains("keywords")) {
            List list = z2Var.f17725y;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(z2Var.f17726z));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(z2Var.A));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(z2Var.B));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(z2Var.C);
        }
        if (hashSet.contains("location")) {
            Location location = z2Var.E;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(z2Var.F);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(z2Var.G));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(z2Var.H));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = z2Var.I;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(z2Var.J);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(z2Var.K);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(z2Var.L));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(z2Var.N));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(z2Var.O);
        }
        if (hashSet.contains("orientation")) {
            if (f3Var != null) {
                arrayList.add(Integer.valueOf(f3Var.f17635u));
            } else {
                arrayList.add(null);
            }
        }
        this.f11416a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = a((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tq0)) {
            return false;
        }
        return Arrays.equals(this.f11416a, ((tq0) obj).f11416a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11416a);
    }

    public final String toString() {
        Object[] objArr = this.f11416a;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hashCode).length() + 10 + String.valueOf(arrays).length() + 1);
        sb2.append("[PoolKey#");
        sb2.append(hashCode);
        sb2.append(" ");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}

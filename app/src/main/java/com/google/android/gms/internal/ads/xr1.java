package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class xr1 implements sr1 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12610c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f12611a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12612b;

    static {
        tr1.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ xr1(List list, List list2) {
        this.f12611a = list;
        this.f12612b = list2;
    }

    public static com.google.android.gms.internal.measurement.e4 a(int i, int i10) {
        return new com.google.android.gms.internal.measurement.e4(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int i;
        List list = this.f12611a;
        int size = list.size();
        List list2 = this.f12612b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((wr1) list2.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        if (size < 3) {
            i = size + 1;
        } else if (size < 1073741824) {
            i = (int) ((size / 0.75f) + 1.0f);
        } else {
            i = Integer.MAX_VALUE;
        }
        HashSet hashSet = new HashSet(i);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object zzb = ((wr1) list.get(i11)).zzb();
            zzb.getClass();
            hashSet.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}

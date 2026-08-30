package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends qm {
    public static final j F = new j(new i());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7263w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f7264x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7265y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f7266z;

    static {
        String str = bq0.f4860a;
        Integer.toString(AdError.NETWORK_ERROR_CODE, 36);
        Integer.toString(AdError.NO_FILL_ERROR_CODE, 36);
        Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public j(i iVar) {
        super(iVar);
        this.f7263w = iVar.f6940w;
        this.f7264x = iVar.f6941x;
        this.f7265y = iVar.f6942y;
        this.f7266z = iVar.f6943z;
        this.A = iVar.A;
        this.B = iVar.B;
        this.C = iVar.C;
        this.D = iVar.D;
        this.E = iVar.E;
    }

    @Override // com.google.android.gms.internal.ads.qm
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (super.equals(jVar) && this.f7263w == jVar.f7263w && this.f7264x == jVar.f7264x && this.f7265y == jVar.f7265y && this.f7266z == jVar.f7266z && this.A == jVar.A && this.B == jVar.B && this.C == jVar.C) {
                    SparseBooleanArray sparseBooleanArray = jVar.E;
                    SparseBooleanArray sparseBooleanArray2 = this.E;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            } else {
                                SparseArray sparseArray = jVar.D;
                                SparseArray sparseArray2 = this.D;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i10));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i10);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    zy1 zy1Var = (zy1) entry.getKey();
                                                    if (map2.containsKey(zy1Var) && Objects.equals(entry.getValue(), map2.get(zy1Var))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qm
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f7263w ? 1 : 0)) * 961) + (this.f7264x ? 1 : 0)) * 961) + (this.f7265y ? 1 : 0)) * 28629151) + (this.f7266z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}

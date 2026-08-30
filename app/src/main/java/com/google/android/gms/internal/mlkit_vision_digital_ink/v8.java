package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class v8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15123a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15124b;

    public v8(String str, boolean z3) {
        this.f15123a = str;
        this.f15124b = z3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v8) {
                v8 v8Var = (v8) obj;
                if (this.f15123a.equals(v8Var.f15123a) && this.f15124b == v8Var.f15124b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f15123a.hashCode() ^ 1000003;
        if (true != this.f15124b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ i;
    }

    public final String toString() {
        return "GetFileGroupRequest{groupName=" + this.f15123a + ", accountOptional=Optional.absent(), variantIdOptional=Optional.absent(), preserveZipDirectories=false, verifyIsolatedStructure=" + this.f15124b + "}";
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15279a;

    /* renamed from: b, reason: collision with root package name */
    public final q2 f15280b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15282d;

    public y6(String str, q2 q2Var, int i, boolean z3) {
        this.f15279a = str;
        this.f15280b = q2Var;
        this.f15282d = i;
        this.f15281c = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.y5, java.lang.Object] */
    public static y5 a() {
        com.google.android.gms.internal.mlkit_vision_digital_ink.y5 obj = new Object();
        obj.e = j2.f14494u;
        byte b10 = (byte) (((byte) (obj.f15278d | 1)) | 2);
        obj.f15275a = 2;
        obj.f15277c = true;
        obj.f15278d = (byte) (((byte) (b10 | 4)) | 8);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y6) {
                y6 y6Var = (y6) obj;
                if (this.f15279a.equals(y6Var.f15279a) && this.f15280b.equals(y6Var.f15280b) && this.f15282d == y6Var.f15282d && this.f15281c == y6Var.f15281c) {
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
        int hashCode = ((((((((((((this.f15279a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f15280b.hashCode();
        if (true != this.f15281c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((hashCode * 1000003) ^ 2040732332) * 583896283) ^ this.f15282d) * 1000003) ^ 1237) * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f15280b);
        if (this.f15282d != 1) {
            str = "ALL";
        } else {
            str = "NONE";
        }
        StringBuilder q10 = p.a.q("DownloadFileGroupRequest{groupName=", this.f15279a, ", accountOptional=Optional.absent(), variantIdOptional=Optional.absent(), contentTitleOptional=Optional.absent(), contentTextOptional=Optional.absent(), contentIntentOptional=Optional.absent(), downloadConditionsOptional=", valueOf, ", listenerOptional=Optional.absent(), groupSizeBytes=0, groupSizeBytesLong=0, showNotifications=");
        q10.append(str);
        q10.append(", preserveZipDirectories=false, verifyIsolatedStructure=");
        q10.append(this.f15281c);
        q10.append("}");
        return q10.toString();
    }
}

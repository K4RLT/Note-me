package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public class sm extends tm {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f14978w;

    public sm(byte[] bArr) {
        this.f15013u = 0;
        bArr.getClass();
        this.f14978w = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tm
    public byte a(int i) {
        return this.f14978w[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tm
    public byte b(int i) {
        return this.f14978w[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tm
    public int d() {
        return this.f14978w.length;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof tm) && d() == ((tm) obj).d()) {
                if (d() != 0) {
                    if (obj instanceof sm) {
                        sm smVar = (sm) obj;
                        int i = this.f15013u;
                        int i10 = smVar.f15013u;
                        if (i == 0 || i10 == 0 || i == i10) {
                            int d2 = d();
                            if (d2 <= smVar.d()) {
                                if (d2 <= smVar.d()) {
                                    byte[] bArr = smVar.f14978w;
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (i11 < d2) {
                                        if (this.f14978w[i11] == bArr[i12]) {
                                            i11++;
                                            i12++;
                                        }
                                    }
                                    return true;
                                }
                                q.x.n(w7.i1.c("Ran off end of other: 0, ", d2, smVar.d(), ", "));
                                return false;
                            }
                            androidx.datastore.preferences.protobuf.s1.c(d2, d());
                            return false;
                        }
                    } else {
                        return obj.equals(this);
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}

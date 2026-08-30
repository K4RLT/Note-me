package ya;
import wa.d7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uf implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31530a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f31530a) {
            case 0:
                int p10 = d7.p(parcel);
                long j10 = 0;
                int i = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < p10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 != 5) {
                                        d7.o(parcel, readInt);
                                    } else {
                                        j10 = d7.m(parcel, readInt);
                                    }
                                } else {
                                    i12 = d7.l(parcel, readInt);
                                }
                            } else {
                                i11 = d7.l(parcel, readInt);
                            }
                        } else {
                            i10 = d7.l(parcel, readInt);
                        }
                    } else {
                        i = d7.l(parcel, readInt);
                    }
                }
                d7.i(parcel, p10);
                return new sf(j10, i, i10, i11, i12);
            case 1:
                int p11 = d7.p(parcel);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                float[] fArr = null;
                Bitmap bitmap = null;
                while (parcel.dataPosition() < p11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int n10 = d7.n(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (n10 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + n10);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) d7.c(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i13 = d7.l(parcel, readInt2);
                            break;
                        case 4:
                            i14 = d7.l(parcel, readInt2);
                            break;
                        case 5:
                            i15 = d7.l(parcel, readInt2);
                            break;
                        case 6:
                            i16 = d7.l(parcel, readInt2);
                            break;
                        case 7:
                            i17 = d7.l(parcel, readInt2);
                            break;
                        default:
                            d7.o(parcel, readInt2);
                            break;
                    }
                }
                d7.i(parcel, p11);
                return new zf(fArr, bitmap, i13, i14, i15, i16, i17);
            case 2:
                int p12 = d7.p(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < p12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    d7.o(parcel, readInt3);
                                } else {
                                    int n11 = d7.n(parcel, readInt3);
                                    int dataPosition2 = parcel.dataPosition();
                                    if (n11 == 0) {
                                        arrayList2 = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int readInt4 = parcel.readInt();
                                        for (int i18 = 0; i18 < readInt4; i18++) {
                                            arrayList3.add(Float.valueOf(parcel.readFloat()));
                                        }
                                        parcel.setDataPosition(dataPosition2 + n11);
                                        arrayList2 = arrayList3;
                                    }
                                }
                            } else {
                                bitmap2 = (Bitmap) d7.c(parcel, readInt3, Bitmap.CREATOR);
                            }
                        } else {
                            int n12 = d7.n(parcel, readInt3);
                            int dataPosition3 = parcel.dataPosition();
                            if (n12 == 0) {
                                fArr2 = null;
                            } else {
                                float[] createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + n12);
                                fArr2 = createFloatArray;
                            }
                        }
                    } else {
                        arrayList = d7.h(parcel, readInt3, zf.CREATOR);
                    }
                }
                d7.i(parcel, p12);
                return new ag(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int p13 = d7.p(parcel);
                boolean z3 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (parcel.dataPosition() < p13) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    if (c12 != 5) {
                                        d7.o(parcel, readInt5);
                                    } else {
                                        z12 = d7.j(parcel, readInt5);
                                    }
                                } else {
                                    z11 = d7.j(parcel, readInt5);
                                }
                            } else {
                                z10 = d7.j(parcel, readInt5);
                            }
                        } else {
                            z9 = d7.j(parcel, readInt5);
                        }
                    } else {
                        z3 = d7.j(parcel, readInt5);
                    }
                }
                d7.i(parcel, p13);
                return new bg(z3, z9, z10, z11, z12);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f31530a) {
            case 0:
                return new sf[i];
            case 1:
                return new zf[i];
            case 2:
                return new ag[i];
            default:
                return new bg[i];
        }
    }
}

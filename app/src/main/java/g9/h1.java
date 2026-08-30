package g9;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.gl;
import java.util.ArrayList;
import wa.d7;

/* loaded from: classes.dex */
public final class h1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17644a;

    public /* synthetic */ h1(int i) {
        this.f17644a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f17644a) {
            case 0:
                int p10 = d7.p(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < p10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            d7.o(parcel, readInt);
                        } else {
                            str2 = d7.d(parcel, readInt);
                        }
                    } else {
                        str = d7.d(parcel, readInt);
                    }
                }
                d7.i(parcel, p10);
                return new o0(str, str2);
            case 1:
                int p11 = d7.p(parcel);
                int i = 0;
                while (parcel.dataPosition() < p11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        d7.o(parcel, readInt2);
                    } else {
                        i = d7.l(parcel, readInt2);
                    }
                }
                d7.i(parcel, p11);
                return new b2(i);
            case 2:
                int p12 = d7.p(parcel);
                String str3 = null;
                String str4 = null;
                y1 y1Var = null;
                IBinder iBinder = null;
                int i10 = 0;
                while (parcel.dataPosition() < p12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    if (c11 != 5) {
                                        d7.o(parcel, readInt3);
                                    } else {
                                        iBinder = d7.k(parcel, readInt3);
                                    }
                                } else {
                                    y1Var = (y1) d7.c(parcel, readInt3, y1.CREATOR);
                                }
                            } else {
                                str4 = d7.d(parcel, readInt3);
                            }
                        } else {
                            str3 = d7.d(parcel, readInt3);
                        }
                    } else {
                        i10 = d7.l(parcel, readInt3);
                    }
                }
                d7.i(parcel, p12);
                return new y1(i10, str3, str4, y1Var, iBinder);
            case 3:
                int p13 = d7.p(parcel);
                String str5 = null;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < p13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                d7.o(parcel, readInt4);
                            } else {
                                str5 = d7.d(parcel, readInt4);
                            }
                        } else {
                            i12 = d7.l(parcel, readInt4);
                        }
                    } else {
                        i11 = d7.l(parcel, readInt4);
                    }
                }
                d7.i(parcel, p13);
                return new l2(str5, i11, i12);
            case 4:
                int p14 = d7.p(parcel);
                int i13 = 0;
                int i14 = 0;
                boolean z3 = false;
                String str6 = null;
                z2 z2Var = null;
                while (parcel.dataPosition() < p14) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                if (c13 != 4) {
                                    if (c13 != 5) {
                                        d7.o(parcel, readInt5);
                                    } else {
                                        z3 = d7.j(parcel, readInt5);
                                    }
                                } else {
                                    i14 = d7.l(parcel, readInt5);
                                }
                            } else {
                                z2Var = (z2) d7.c(parcel, readInt5, z2.CREATOR);
                            }
                        } else {
                            i13 = d7.l(parcel, readInt5);
                        }
                    } else {
                        str6 = d7.d(parcel, readInt5);
                    }
                }
                d7.i(parcel, p14);
                return new t2(str6, i13, z2Var, i14, z3);
            case 5:
                int p15 = d7.p(parcel);
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < p15) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            d7.o(parcel, readInt6);
                        } else {
                            i16 = d7.l(parcel, readInt6);
                        }
                    } else {
                        i15 = d7.l(parcel, readInt6);
                    }
                }
                d7.i(parcel, p15);
                return new u2(i15, i16);
            case 6:
                int p16 = d7.p(parcel);
                String str7 = null;
                while (parcel.dataPosition() < p16) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 15) {
                        d7.o(parcel, readInt7);
                    } else {
                        str7 = d7.d(parcel, readInt7);
                    }
                }
                d7.i(parcel, p16);
                return new v2(str7);
            case 7:
                int p17 = d7.p(parcel);
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < p17) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            if (c15 != 4) {
                                d7.o(parcel, readInt8);
                            } else {
                                z11 = d7.j(parcel, readInt8);
                            }
                        } else {
                            z10 = d7.j(parcel, readInt8);
                        }
                    } else {
                        z9 = d7.j(parcel, readInt8);
                    }
                }
                d7.i(parcel, p17);
                return new w2(z9, z10, z11);
            case 8:
                int p18 = d7.p(parcel);
                int i17 = 0;
                int i18 = 0;
                boolean z12 = false;
                int i19 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                Bundle bundle = null;
                ArrayList arrayList = null;
                String str8 = null;
                v2 v2Var = null;
                Location location = null;
                String str9 = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                o0 o0Var = null;
                String str12 = null;
                ArrayList arrayList3 = null;
                String str13 = null;
                while (parcel.dataPosition() < p18) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i17 = d7.l(parcel, readInt9);
                            break;
                        case 2:
                            j10 = d7.m(parcel, readInt9);
                            break;
                        case 3:
                            bundle = d7.a(parcel, readInt9);
                            break;
                        case 4:
                            i18 = d7.l(parcel, readInt9);
                            break;
                        case 5:
                            arrayList = d7.f(parcel, readInt9);
                            break;
                        case 6:
                            z12 = d7.j(parcel, readInt9);
                            break;
                        case 7:
                            i19 = d7.l(parcel, readInt9);
                            break;
                        case '\b':
                            z13 = d7.j(parcel, readInt9);
                            break;
                        case '\t':
                            str8 = d7.d(parcel, readInt9);
                            break;
                        case '\n':
                            v2Var = (v2) d7.c(parcel, readInt9, v2.CREATOR);
                            break;
                        case 11:
                            location = (Location) d7.c(parcel, readInt9, Location.CREATOR);
                            break;
                        case '\f':
                            str9 = d7.d(parcel, readInt9);
                            break;
                        case '\r':
                            bundle2 = d7.a(parcel, readInt9);
                            break;
                        case 14:
                            bundle3 = d7.a(parcel, readInt9);
                            break;
                        case 15:
                            arrayList2 = d7.f(parcel, readInt9);
                            break;
                        case 16:
                            str10 = d7.d(parcel, readInt9);
                            break;
                        case 17:
                            str11 = d7.d(parcel, readInt9);
                            break;
                        case 18:
                            z14 = d7.j(parcel, readInt9);
                            break;
                        case 19:
                            o0Var = (o0) d7.c(parcel, readInt9, o0.CREATOR);
                            break;
                        case 20:
                            i20 = d7.l(parcel, readInt9);
                            break;
                        case gl.zzm /* 21 */:
                            str12 = d7.d(parcel, readInt9);
                            break;
                        case 22:
                            arrayList3 = d7.f(parcel, readInt9);
                            break;
                        case 23:
                            i21 = d7.l(parcel, readInt9);
                            break;
                        case 24:
                            str13 = d7.d(parcel, readInt9);
                            break;
                        case 25:
                            i22 = d7.l(parcel, readInt9);
                            break;
                        case 26:
                            j11 = d7.m(parcel, readInt9);
                            break;
                        case 27:
                            j12 = d7.m(parcel, readInt9);
                            break;
                        case 28:
                            i23 = d7.l(parcel, readInt9);
                            break;
                        default:
                            d7.o(parcel, readInt9);
                            break;
                    }
                }
                d7.i(parcel, p18);
                return new z2(i17, j10, bundle, i18, arrayList, z12, i19, z13, str8, v2Var, location, str9, bundle2, bundle3, arrayList2, str10, str11, z14, o0Var, i20, str12, arrayList3, i21, str13, i22, j11, j12, i23);
            case 9:
                int p19 = d7.p(parcel);
                int i24 = 0;
                int i25 = 0;
                boolean z15 = false;
                int i26 = 0;
                int i27 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                String str14 = null;
                c3[] c3VarArr = null;
                while (parcel.dataPosition() < p19) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str14 = d7.d(parcel, readInt10);
                            break;
                        case 3:
                            i24 = d7.l(parcel, readInt10);
                            break;
                        case 4:
                            i25 = d7.l(parcel, readInt10);
                            break;
                        case 5:
                            z15 = d7.j(parcel, readInt10);
                            break;
                        case 6:
                            i26 = d7.l(parcel, readInt10);
                            break;
                        case 7:
                            i27 = d7.l(parcel, readInt10);
                            break;
                        case '\b':
                            c3VarArr = (c3[]) d7.g(parcel, readInt10, c3.CREATOR);
                            break;
                        case '\t':
                            z16 = d7.j(parcel, readInt10);
                            break;
                        case '\n':
                            z17 = d7.j(parcel, readInt10);
                            break;
                        case 11:
                            z18 = d7.j(parcel, readInt10);
                            break;
                        case '\f':
                            z19 = d7.j(parcel, readInt10);
                            break;
                        case '\r':
                            z20 = d7.j(parcel, readInt10);
                            break;
                        case 14:
                            z21 = d7.j(parcel, readInt10);
                            break;
                        case 15:
                            z22 = d7.j(parcel, readInt10);
                            break;
                        case 16:
                            z23 = d7.j(parcel, readInt10);
                            break;
                        case 17:
                            z24 = d7.j(parcel, readInt10);
                            break;
                        default:
                            d7.o(parcel, readInt10);
                            break;
                    }
                }
                d7.i(parcel, p19);
                return new c3(str14, i24, i25, z15, i26, i27, c3VarArr, z16, z17, z18, z19, z20, z21, z22, z23, z24);
            case 10:
                int p20 = d7.p(parcel);
                long j13 = 0;
                String str15 = null;
                int i28 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < p20) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                if (c16 != 4) {
                                    d7.o(parcel, readInt11);
                                } else {
                                    j13 = d7.m(parcel, readInt11);
                                }
                            } else {
                                str15 = d7.d(parcel, readInt11);
                            }
                        } else {
                            i29 = d7.l(parcel, readInt11);
                        }
                    } else {
                        i28 = d7.l(parcel, readInt11);
                    }
                }
                d7.i(parcel, p20);
                return new d3(i28, i29, j13, str15);
            case 11:
                int p21 = d7.p(parcel);
                String str16 = null;
                y1 y1Var2 = null;
                Bundle bundle4 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                long j14 = 0;
                while (parcel.dataPosition() < p21) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str16 = d7.d(parcel, readInt12);
                            break;
                        case 2:
                            j14 = d7.m(parcel, readInt12);
                            break;
                        case 3:
                            y1Var2 = (y1) d7.c(parcel, readInt12, y1.CREATOR);
                            break;
                        case 4:
                            bundle4 = d7.a(parcel, readInt12);
                            break;
                        case 5:
                            str17 = d7.d(parcel, readInt12);
                            break;
                        case 6:
                            str18 = d7.d(parcel, readInt12);
                            break;
                        case 7:
                            str19 = d7.d(parcel, readInt12);
                            break;
                        case '\b':
                            str20 = d7.d(parcel, readInt12);
                            break;
                        default:
                            d7.o(parcel, readInt12);
                            break;
                    }
                }
                d7.i(parcel, p21);
                return new e3(str16, j14, y1Var2, bundle4, str17, str18, str19, str20);
            default:
                int p22 = d7.p(parcel);
                int i30 = 0;
                while (parcel.dataPosition() < p22) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        d7.o(parcel, readInt13);
                    } else {
                        i30 = d7.l(parcel, readInt13);
                    }
                }
                d7.i(parcel, p22);
                return new f3(i30);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f17644a) {
            case 0:
                return new o0[i];
            case 1:
                return new b2[i];
            case 2:
                return new y1[i];
            case 3:
                return new l2[i];
            case 4:
                return new t2[i];
            case 5:
                return new u2[i];
            case 6:
                return new v2[i];
            case 7:
                return new w2[i];
            case 8:
                return new z2[i];
            case 9:
                return new c3[i];
            case 10:
                return new d3[i];
            case 11:
                return new e3[i];
            default:
                return new f3[i];
        }
    }
}

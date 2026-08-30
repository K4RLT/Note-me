package i9;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ads.gl;
import f9.f;
import ia.c;
import j9.e;
import java.util.ArrayList;
import k9.m;
import nd.n;
import wa.d7;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18357a;

    public /* synthetic */ b(int i) {
        this.f18357a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z3;
        switch (this.f18357a) {
            case 0:
                int p10 = d7.p(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < p10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                d7.o(parcel, readInt);
                            } else {
                                str3 = d7.d(parcel, readInt);
                            }
                        } else {
                            str2 = d7.d(parcel, readInt);
                        }
                    } else {
                        str = d7.d(parcel, readInt);
                    }
                }
                d7.i(parcel, p10);
                return new a(str, str2, str3);
            case 1:
                int p11 = d7.p(parcel);
                boolean z9 = false;
                int i = 0;
                while (parcel.dataPosition() < p11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            d7.o(parcel, readInt2);
                        } else {
                            i = d7.l(parcel, readInt2);
                        }
                    } else {
                        z9 = d7.j(parcel, readInt2);
                    }
                }
                d7.i(parcel, p11);
                return new ia.a(i, z9);
            case 2:
                int p12 = d7.p(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < p12) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        d7.o(parcel, readInt3);
                    } else {
                        pendingIntent = (PendingIntent) d7.c(parcel, readInt3, PendingIntent.CREATOR);
                    }
                }
                d7.i(parcel, p12);
                return new ia.b(pendingIntent);
            case 3:
                int p13 = d7.p(parcel);
                int i10 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < p13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            d7.o(parcel, readInt4);
                        } else {
                            z10 = d7.j(parcel, readInt4);
                        }
                    } else {
                        i10 = d7.l(parcel, readInt4);
                    }
                }
                d7.i(parcel, p13);
                return new c(i10, z10);
            case 4:
                int p14 = d7.p(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Intent intent = null;
                IBinder iBinder = null;
                Bundle bundle = null;
                boolean z11 = false;
                while (parcel.dataPosition() < p14) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str4 = d7.d(parcel, readInt5);
                            break;
                        case 3:
                            str5 = d7.d(parcel, readInt5);
                            break;
                        case 4:
                            str6 = d7.d(parcel, readInt5);
                            break;
                        case 5:
                            str7 = d7.d(parcel, readInt5);
                            break;
                        case 6:
                            str8 = d7.d(parcel, readInt5);
                            break;
                        case 7:
                            str9 = d7.d(parcel, readInt5);
                            break;
                        case '\b':
                            str10 = d7.d(parcel, readInt5);
                            break;
                        case '\t':
                            intent = (Intent) d7.c(parcel, readInt5, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinder = d7.k(parcel, readInt5);
                            break;
                        case 11:
                            z11 = d7.j(parcel, readInt5);
                            break;
                        case '\f':
                            bundle = d7.a(parcel, readInt5);
                            break;
                        default:
                            d7.o(parcel, readInt5);
                            break;
                    }
                }
                d7.i(parcel, p14);
                return new e(str4, str5, str6, str7, str8, str9, str10, intent, iBinder, z11, bundle);
            case 5:
                int p15 = d7.p(parcel);
                long j10 = 0;
                boolean z12 = false;
                int i11 = 0;
                int i12 = 0;
                boolean z13 = false;
                e eVar = null;
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                IBinder iBinder5 = null;
                String str11 = null;
                String str12 = null;
                IBinder iBinder6 = null;
                String str13 = null;
                l9.a aVar = null;
                String str14 = null;
                f fVar = null;
                IBinder iBinder7 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                IBinder iBinder8 = null;
                IBinder iBinder9 = null;
                IBinder iBinder10 = null;
                while (parcel.dataPosition() < p15) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            eVar = (e) d7.c(parcel, readInt6, e.CREATOR);
                            break;
                        case 3:
                            iBinder2 = d7.k(parcel, readInt6);
                            break;
                        case 4:
                            iBinder3 = d7.k(parcel, readInt6);
                            break;
                        case 5:
                            iBinder4 = d7.k(parcel, readInt6);
                            break;
                        case 6:
                            iBinder5 = d7.k(parcel, readInt6);
                            break;
                        case 7:
                            str11 = d7.d(parcel, readInt6);
                            break;
                        case '\b':
                            z12 = d7.j(parcel, readInt6);
                            break;
                        case '\t':
                            str12 = d7.d(parcel, readInt6);
                            break;
                        case '\n':
                            iBinder6 = d7.k(parcel, readInt6);
                            break;
                        case 11:
                            i11 = d7.l(parcel, readInt6);
                            break;
                        case '\f':
                            i12 = d7.l(parcel, readInt6);
                            break;
                        case '\r':
                            str13 = d7.d(parcel, readInt6);
                            break;
                        case 14:
                            aVar = (l9.a) d7.c(parcel, readInt6, l9.a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case gl.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            d7.o(parcel, readInt6);
                            break;
                        case 16:
                            str14 = d7.d(parcel, readInt6);
                            break;
                        case 17:
                            fVar = (f) d7.c(parcel, readInt6, f.CREATOR);
                            break;
                        case 18:
                            iBinder7 = d7.k(parcel, readInt6);
                            break;
                        case 19:
                            str15 = d7.d(parcel, readInt6);
                            break;
                        case 24:
                            str16 = d7.d(parcel, readInt6);
                            break;
                        case 25:
                            str17 = d7.d(parcel, readInt6);
                            break;
                        case 26:
                            iBinder8 = d7.k(parcel, readInt6);
                            break;
                        case 27:
                            iBinder9 = d7.k(parcel, readInt6);
                            break;
                        case 28:
                            iBinder10 = d7.k(parcel, readInt6);
                            break;
                        case 29:
                            z13 = d7.j(parcel, readInt6);
                            break;
                        case 30:
                            j10 = d7.m(parcel, readInt6);
                            break;
                    }
                }
                d7.i(parcel, p15);
                return new AdOverlayInfoParcel(eVar, iBinder2, iBinder3, iBinder4, iBinder5, str11, z12, str12, iBinder6, i11, i12, str13, aVar, str14, fVar, iBinder7, str15, str16, str17, iBinder8, iBinder9, iBinder10, z13, j10);
            case 6:
                int p16 = d7.p(parcel);
                int i13 = 0;
                String str18 = null;
                while (parcel.dataPosition() < p16) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            d7.o(parcel, readInt7);
                        } else {
                            i13 = d7.l(parcel, readInt7);
                        }
                    } else {
                        str18 = d7.d(parcel, readInt7);
                    }
                }
                d7.i(parcel, p16);
                return new m(str18, i13);
            case 7:
                int p17 = d7.p(parcel);
                int i14 = 0;
                int i15 = 0;
                boolean z14 = false;
                boolean z15 = false;
                String str19 = null;
                while (parcel.dataPosition() < p17) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            if (c14 != 4) {
                                if (c14 != 5) {
                                    if (c14 != 6) {
                                        d7.o(parcel, readInt8);
                                    } else {
                                        z15 = d7.j(parcel, readInt8);
                                    }
                                } else {
                                    z14 = d7.j(parcel, readInt8);
                                }
                            } else {
                                i15 = d7.l(parcel, readInt8);
                            }
                        } else {
                            i14 = d7.l(parcel, readInt8);
                        }
                    } else {
                        str19 = d7.d(parcel, readInt8);
                    }
                }
                d7.i(parcel, p17);
                return new l9.a(i14, i15, str19, z14, z15);
            case 8:
                int p18 = d7.p(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < p18) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 2) {
                        d7.o(parcel, readInt9);
                    } else {
                        bundle2 = d7.a(parcel, readInt9);
                    }
                }
                d7.i(parcel, p18);
                return new n(bundle2);
            case 9:
                return new pb.a(parcel);
            case 10:
                PendingIntent pendingIntent2 = (PendingIntent) parcel.readParcelable(ub.a.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new ub.b(pendingIntent2, z3);
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                int p19 = d7.p(parcel);
                String str20 = null;
                int i16 = 0;
                while (parcel.dataPosition() < p19) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            d7.o(parcel, readInt10);
                        } else {
                            i16 = d7.l(parcel, readInt10);
                        }
                    } else {
                        str20 = d7.d(parcel, readInt10);
                    }
                }
                d7.i(parcel, p19);
                return new y9.c(str20, i16);
            default:
                int p20 = d7.p(parcel);
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                Uri uri = null;
                String str25 = null;
                String str26 = null;
                ArrayList arrayList = null;
                String str27 = null;
                String str28 = null;
                long j11 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < p20) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i17 = d7.l(parcel, readInt11);
                            break;
                        case 2:
                            str21 = d7.d(parcel, readInt11);
                            break;
                        case 3:
                            str22 = d7.d(parcel, readInt11);
                            break;
                        case 4:
                            str23 = d7.d(parcel, readInt11);
                            break;
                        case 5:
                            str24 = d7.d(parcel, readInt11);
                            break;
                        case 6:
                            uri = (Uri) d7.c(parcel, readInt11, Uri.CREATOR);
                            break;
                        case 7:
                            str25 = d7.d(parcel, readInt11);
                            break;
                        case '\b':
                            j11 = d7.m(parcel, readInt11);
                            break;
                        case '\t':
                            str26 = d7.d(parcel, readInt11);
                            break;
                        case '\n':
                            arrayList = d7.h(parcel, readInt11, Scope.CREATOR);
                            break;
                        case 11:
                            str27 = d7.d(parcel, readInt11);
                            break;
                        case '\f':
                            str28 = d7.d(parcel, readInt11);
                            break;
                        default:
                            d7.o(parcel, readInt11);
                            break;
                    }
                }
                d7.i(parcel, p20);
                return new GoogleSignInAccount(i17, str21, str22, str23, str24, uri, str25, j11, str26, arrayList, str27, str28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f18357a) {
            case 0:
                return new a[i];
            case 1:
                return new ia.a[i];
            case 2:
                return new ia.b[i];
            case 3:
                return new c[i];
            case 4:
                return new e[i];
            case 5:
                return new AdOverlayInfoParcel[i];
            case 6:
                return new m[i];
            case 7:
                return new l9.a[i];
            case 8:
                return new n[i];
            case 9:
                return new pb.a[i];
            case 10:
                return new ub.a[i];
            case 11:
                return new ParcelImpl[i];
            case 12:
                return new y9.c[i];
            default:
                return new GoogleSignInAccount[i];
        }
    }
}

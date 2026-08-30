package com.google.android.gms.internal.mlkit_vision_digital_ink;
import c7.f0;
import g3.a;
import g5.q;
import q.h;
import q.x;
import x.l;
import x.m;
import x.n;
import x.o;
import x.p;

import android.content.Context;
import androidx.ink.brush.color.colorspace.ColorSpace;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class pa implements ya, Future {

    /* renamed from: w, reason: collision with root package name */
    public static ql f14791w;

    /* renamed from: x, reason: collision with root package name */
    public static final jm f14792x = new jm(29);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14793u = 4;

    /* renamed from: v, reason: collision with root package name */
    public final ya f14794v;

    public pa(ya yaVar) {
        yaVar.getClass();
        this.f14794v = yaVar;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 61:
                return 62;
            case 62:
                return 63;
            case ColorSpace.MAX_ID /* 63 */:
                return 64;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case AdSizeApi.INTERSTITIAL /* 100 */:
                return FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
            case FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS /* 101 */:
                return FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
            case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
                return FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
            case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                return FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
            case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                return FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS;
            case FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS /* 105 */:
                return FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE;
            case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return 124;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 244:
                return 245;
            case 245:
                return 246;
            case 251:
                return 252;
            case 252:
                return 253;
            case 260:
                return 261;
            case 261:
                return 262;
            case 271:
                return 272;
            case 272:
                return 273;
            case 273:
                return 274;
            case 281:
                return 282;
            case 291:
                return 292;
            case 292:
                return 293;
            case 293:
                return 294;
            case 301:
                return 302;
            case 302:
                return 303;
            case 311:
                return 312;
            case 312:
                return 313;
            case 313:
                return 314;
            case 314:
                return 315;
            case 315:
                return 316;
            case 321:
                return 322;
            case 322:
                return 323;
            case 323:
                return 324;
            case 324:
                return 325;
            case 325:
                return 326;
            case 331:
                return 332;
            case 332:
                return 333;
            case 333:
                return 334;
            case 334:
                return 335;
            case 341:
                return 342;
            case 342:
                return 343;
            case 343:
                return 344;
            case 344:
                return 345;
            case 351:
                return 352;
            case 352:
                return 353;
            case 353:
                return 354;
            case 354:
                return 355;
            case 361:
                return 362;
            case 371:
                return 372;
            case 381:
                return 382;
            case 391:
                return 392;
            case 401:
                return 402;
            case 402:
                return 403;
            case 403:
                return 404;
            case 404:
                return 405;
            case 405:
                return 406;
            case 411:
                return 412;
            case 412:
                return 413;
            case 413:
                return 414;
            case 414:
                return 415;
            case 415:
                return 416;
            case 421:
                return 422;
            case 422:
                return 423;
            case 423:
                return 424;
            case 424:
                return 425;
            case 431:
                return 432;
            case 432:
                return 433;
            case 441:
                return 442;
            case 442:
                return 443;
            case 443:
                return 444;
            case 451:
                return 452;
            case 452:
                return 453;
            case 453:
                return 454;
            case 454:
                return 455;
            case 461:
                return 462;
            case 462:
                return 463;
            case 463:
                return 464;
            case 464:
                return 465;
            case 471:
                return 472;
            case 472:
                return 473;
            case 473:
                return 474;
            case 474:
                return 475;
            case 475:
                return 476;
            case 481:
                return 482;
            case 482:
                return 483;
            case 483:
                return 484;
            case 484:
                return 485;
            case 491:
                return 492;
            case 492:
                return 493;
            case 501:
                return 502;
            case 502:
                return 503;
            case 503:
                return 504;
            case 504:
                return 505;
            case 511:
                return 512;
            case 512:
                return 513;
            case 513:
                return 514;
            case 514:
                return 515;
            case 521:
                return 522;
            case 522:
                return 523;
            case 523:
                return 524;
            case 524:
                return 525;
            case 531:
                return 532;
            case 532:
                return 533;
            case 533:
                return 534;
            case 534:
                return 535;
            case 541:
                return 542;
            case 542:
                return 543;
            case 543:
                return 544;
            case 544:
                return 545;
            case 551:
                return 552;
            case 552:
                return 553;
            case 553:
                return 554;
            case 554:
                return 555;
            case 561:
                return 562;
            case 562:
                return 563;
            case 563:
                return 564;
            case 564:
                return 565;
            case 571:
                return 572;
            case 572:
                return 573;
            case 573:
                return 574;
            case 574:
                return 575;
            case 581:
                return 582;
            case 582:
                return 583;
            case 583:
                return 584;
            case 584:
                return 585;
            case 591:
                return 592;
            case 592:
                return 593;
            case 593:
                return 594;
            case 594:
                return 595;
            case 601:
                return 602;
            case 602:
                return 603;
            case 603:
                return 604;
            case 604:
                return 605;
            case 605:
                return 606;
            case 611:
                return 612;
            case 612:
                return 613;
            case 613:
                return 614;
            case 614:
                return 615;
            case 621:
                return 622;
            case 622:
                return 623;
            case 623:
                return 624;
            case 624:
                return 625;
            case 631:
                return 632;
            case 632:
                return 633;
            case 633:
                return 634;
            case 634:
                return 635;
            case 641:
                return 642;
            case 642:
                return 643;
            case 643:
                return 644;
            case 644:
                return 645;
            case 651:
                return 652;
            case 652:
                return 653;
            case 653:
                return 654;
            case 654:
                return 655;
            case 655:
                return 656;
            case 656:
                return 657;
            case 657:
                return 658;
            case 658:
                return 659;
            case 659:
                return 660;
            case 671:
                return 672;
            case 672:
                return 673;
            case 673:
                return 674;
            case 681:
                return 682;
            case 682:
                return 683;
            case 683:
                return 684;
            case 684:
                return 685;
            case 691:
                return 692;
            case 692:
                return 693;
            case 693:
                return 694;
            case 694:
                return 695;
            case 701:
                return 702;
            case 702:
                return 703;
            case 703:
                return 704;
            case 704:
                return 705;
            case 711:
                return 712;
            case 712:
                return 713;
            case 713:
                return 714;
            case 714:
                return 715;
            case 721:
                return 722;
            case 722:
                return 723;
            case 723:
                return 724;
            case 724:
                return 725;
            case 725:
                return 726;
            case 731:
                return 732;
            case 732:
                return 733;
            case 733:
                return 734;
            case 734:
                return 735;
            case 735:
                return 736;
            case 741:
                return 742;
            case 742:
                return 743;
            case 743:
                return 744;
            case 744:
                return 745;
            case 745:
                return 746;
            case 746:
                return 747;
            case 747:
                return 748;
            case 751:
                return 752;
            case 752:
                return 753;
            case 753:
                return 754;
            case 754:
                return 755;
            case 761:
                return 762;
            case 762:
                return 763;
            case 763:
                return 764;
            case 764:
                return 765;
            case 771:
                return 772;
            case 772:
                return 773;
            case 773:
                return 774;
            case 781:
                return 782;
            case 782:
                return 783;
            case 783:
                return 784;
            case 791:
                return 792;
            case 792:
                return 793;
            case 793:
                return 794;
            case 801:
                return 802;
            case 802:
                return 803;
            case 803:
                return 804;
            case 811:
                return 812;
            case 812:
                return 813;
            case 813:
                return 814;
            case 821:
                return 822;
            case 822:
                return 823;
            case 823:
                return 824;
            default:
                return 0;
        }
    }

    public static x0 c(Context context, ab abVar, s5 s5Var, q2 q2Var) {
        u0 u0Var = new u0(context.getApplicationContext(), abVar);
        u0Var.f15038x = nw.q("gms_icing_mdd_groups", q2Var);
        u0Var.f15039y = new jv(1, s5Var);
        u0Var.f15040z = new s5(3, new ow(4));
        return new x0(u0Var);
    }

    public static void d(int i, int i10) {
        String e;
        if (i >= 0 && i < i10) {
            return;
        }
        if (i >= 0) {
            if (i10 < 0) {
                q.x.n(g3.a.g(i10, "negative size: "));
                return;
            }
            e = tl.e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            e = tl.e("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(e);
    }

    public static void e(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            q.x.p("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void f(Object obj) {
        if (obj != null) {
            return;
        }
        g5.q.h("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void h(boolean z3, String str, Object... objArr) {
        if (z3) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = w4.f15177v;
            }
        } else if (collection instanceof g5) {
            obj = ((g5) collection).f14358x;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static x0 j(Context context, ab abVar, s5 s5Var, q2 q2Var) {
        u0 u0Var = new u0(context.getApplicationContext(), abVar);
        u0Var.f15038x = nw.q("gms_icing_mdd_shared_files", q2Var);
        u0Var.f15039y = new jv(1, s5Var);
        u0Var.f15040z = new s5(3, new ow(5));
        return new x0(u0Var);
    }

    public static void l(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return;
        }
        q.x.l(t("index", i, i10));
    }

    public static void m(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        q.x.o(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c7.f0, java.lang.Object] */
    public static s5 n(ya... yaVarArr) {
        e4 e4Var = h4.f14393v;
        Object[] objArr = (Object[]) yaVarArr.clone();
        int length = objArr.length;
        n5.g(objArr, length);
        z4 r8 = h4.r(objArr, length);
        Object obj = new Object();
        obj.f3949u = true;
        obj.f3950v = r8;
        return new s5(23, (Object) obj);
    }

    public static void o(ya yaVar, String str, Object obj) {
        if (yaVar != null) {
            return;
        }
        g5.q.h(tl.e(str, obj));
    }

    public static void p(boolean z3) {
        if (z3) {
            return;
        }
        q.x.m();
    }

    public static void q(boolean z3, String str, Object obj) {
        if (z3) {
            return;
        }
        q.x.n(tl.e(str, obj));
    }

    public static void r(int i, int i10, int i11) {
        String t3;
        if (i >= 0 && i10 >= i && i10 <= i11) {
            return;
        }
        if (i >= 0 && i <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                t3 = tl.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            } else {
                t3 = t("end index", i10, i11);
            }
        } else {
            t3 = t("start index", i, i11);
        }
        throw new IndexOutOfBoundsException(t3);
    }

    public static void s(String str, boolean z3) {
        if (z3) {
            return;
        }
        q.x.o(str);
    }

    public static String t(String str, int i, int i10) {
        if (i < 0) {
            return tl.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return tl.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        q.x.n(g3.a.g(i10, "negative size: "));
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        return this.f14794v.cancel(z3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ya
    public final void g(Runnable runnable, Executor executor) {
        this.f14794v.g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14794v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14794v.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14794v.isDone();
    }

    public String toString() {
        switch (this.f14793u) {
            case 4:
                return this.f14794v.toString();
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f14794v.get(j10, timeUnit);
    }
}

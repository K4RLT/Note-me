package a0;
import b.a;
import b0.i;
import c.h0;
import d.f;
import j.i0;
import l.d;
import q.b;

import a0.f0;
import android.app.Notification;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import b0.e1;
import f3.r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46a;

    /* renamed from: b, reason: collision with root package name */
    public int f47b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f48c;

    /* renamed from: d, reason: collision with root package name */
    public Object f49d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f50f;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(f3.i iVar) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        Icon f10;
        ArrayList arrayList;
        int i;
        Bundle bundle;
        int i10;
        ArrayList arrayList2;
        Icon icon;
        Bundle bundle2;
        int i11;
        this.f46a = 1;
        new ArrayList();
        this.f50f = new Bundle();
        this.e = iVar;
        Context context = iVar.f16661a;
        ArrayList arrayList3 = iVar.f16680v;
        ArrayList arrayList4 = iVar.f16663c;
        ArrayList arrayList5 = iVar.f16664d;
        this.f48c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f49d = f2.a(context, iVar.f16676r);
        } else {
            this.f49d = new Notification.Builder(context);
        }
        Notification notification = iVar.f16678t;
        Context context2 = null;
        Notification.Builder lights = ((Notification.Builder) this.f49d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z3);
        if ((notification.flags & 8) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z9);
        if ((notification.flags & 16) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z10).setDefaults(notification.defaults).setContentTitle(iVar.e).setContentText(iVar.f16665f).setContentInfo(null).setContentIntent(iVar.f16666g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        deleteIntent.setFullScreenIntent(null, z11).setNumber(iVar.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f49d;
        IconCompat iconCompat = iVar.f16667h;
        if (iconCompat == null) {
            f10 = null;
        } else {
            f10 = iconCompat.f(context);
        }
        builder.setLargeIcon(f10);
        ((Notification.Builder) this.f49d).setSubText(null).setUsesChronometer(false).setPriority(iVar.f16668j);
        ArrayList arrayList6 = iVar.f16662b;
        int size = arrayList6.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList6.get(i12);
            i12++;
            f3.c cVar = (f3.c) obj;
            if (cVar.f16653b == null && (i11 = cVar.e) != 0) {
                cVar.f16653b = IconCompat.b(i11);
            }
            IconCompat iconCompat2 = cVar.f16653b;
            boolean z12 = cVar.f16654c;
            Bundle bundle3 = cVar.f16652a;
            if (iconCompat2 != null) {
                icon = iconCompat2.f(context2);
            } else {
                icon = context2;
            }
            ArrayList arrayList7 = arrayList6;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, cVar.f16656f, cVar.f16657g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z12);
            builder2.setAllowGeneratedReplies(z12);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 28) {
                f3.k.o(builder2);
            }
            if (i13 >= 29) {
                f2.a.n(builder2);
            }
            if (i13 >= 31) {
                f3.d(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", cVar.f16655d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f49d).addAction(builder2.build());
            arrayList6 = arrayList7;
            context2 = null;
        }
        Bundle bundle4 = iVar.f16673o;
        if (bundle4 != null) {
            ((Bundle) this.f50f).putAll(bundle4);
        }
        ((Notification.Builder) this.f49d).setShowWhen(iVar.f16669k);
        ((Notification.Builder) this.f49d).setLocalOnly(iVar.f16671m);
        ((Notification.Builder) this.f49d).setGroup(null);
        ((Notification.Builder) this.f49d).setSortKey(null);
        ((Notification.Builder) this.f49d).setGroupSummary(false);
        this.f47b = 0;
        ((Notification.Builder) this.f49d).setCategory(iVar.f16672n);
        ((Notification.Builder) this.f49d).setColor(iVar.f16674p);
        ((Notification.Builder) this.f49d).setVisibility(iVar.f16675q);
        ((Notification.Builder) this.f49d).setPublicVersion(null);
        ((Notification.Builder) this.f49d).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    g5.b();
                    throw null;
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    f fVar = new f(arrayList3.size() + arrayList2.size());
                    fVar.addAll(arrayList2);
                    fVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList3.get(i14);
                i14++;
                ((Notification.Builder) this.f49d).addPerson((String) obj2);
            }
        }
        if (arrayList5.size() > 0) {
            if (iVar.f16673o == null) {
                iVar.f16673o = new Bundle();
            }
            Bundle bundle5 = iVar.f16673o.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList5.size()) {
                String num = Integer.toString(i15);
                f3.c cVar2 = (f3.c) arrayList5.get(i15);
                Bundle bundle8 = new Bundle();
                if (cVar2.f16653b == null && (i10 = cVar2.e) != 0) {
                    cVar2.f16653b = IconCompat.b(i10);
                }
                IconCompat iconCompat3 = cVar2.f16653b;
                Bundle bundle9 = cVar2.f16652a;
                if (iconCompat3 != null) {
                    i = iconCompat3.c();
                } else {
                    i = 0;
                }
                ArrayList arrayList8 = arrayList4;
                bundle8.putInt("icon", i);
                bundle8.putCharSequence("title", cVar2.f16656f);
                bundle8.putParcelable("actionIntent", cVar2.f16657g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", cVar2.f16654c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", cVar2.f16655d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i15++;
                arrayList4 = arrayList8;
            }
            arrayList = arrayList4;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (iVar.f16673o == null) {
                iVar.f16673o = new Bundle();
            }
            iVar.f16673o.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f50f).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList4;
        }
        ((Notification.Builder) this.f49d).setExtras(iVar.f16673o);
        ((Notification.Builder) this.f49d).setRemoteInputHistory(null);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26) {
            f2.b.h((Notification.Builder) this.f49d);
            f2.b.j((Notification.Builder) this.f49d);
            f2.b.k((Notification.Builder) this.f49d);
            f2.b.l((Notification.Builder) this.f49d);
            f2.b.i((Notification.Builder) this.f49d, 0);
            if (!TextUtils.isEmpty(iVar.f16676r)) {
                ((Notification.Builder) this.f49d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                g5.b();
                throw null;
            }
        }
        if (i16 >= 29) {
            f2.a.k((Notification.Builder) this.f49d, iVar.f16677s);
            f2.a.m((Notification.Builder) this.f49d);
        }
        if (iVar.f16679u) {
            ((f3.i) this.e).getClass();
            this.f47b = 1;
            ((Notification.Builder) this.f49d).setVibrate(null);
            ((Notification.Builder) this.f49d).setSound(null);
            int i17 = notification.defaults & (-4);
            notification.defaults = i17;
            ((Notification.Builder) this.f49d).setDefaults(i17);
            if (i16 >= 26) {
                ((f3.i) this.e).getClass();
                if (TextUtils.isEmpty(null)) {
                    ((Notification.Builder) this.f49d).setGroup("silent");
                }
                f2.b.i((Notification.Builder) this.f49d, 1);
            }
        }
    }

    public static boolean B(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean C(f4.d dVar) {
        if (dVar == null || dVar.f16712x) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void u(f0 f0Var, String str, int i, int i10) {
        String str2;
        if ((i10 & 2) != 0) {
            i = f0Var.f47b;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        } else {
            str2 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
        }
        f0Var.t(str, i, str2);
        throw null;
    }

    public int A() {
        return ((j) this.f48c).f73c.f1179b;
    }

    public byte D() {
        String str = (String) this.f50f;
        int i = this.f47b;
        while (true) {
            int E = E(i);
            if (E != -1) {
                char charAt = str.charAt(E);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.f47b = E;
                    return gg.k.g(charAt);
                }
                i = E + 1;
            } else {
                this.f47b = E;
                return (byte) 10;
            }
        }
    }

    public int E(int i) {
        if (i < ((String) this.f50f).length()) {
            return i;
        }
        return -1;
    }

    public void F(float f10) {
        ((Paint) this.f48c).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void G(int i) {
        if (this.f47b == i) {
            return;
        }
        this.f47b = i;
        Paint paint = (Paint) this.f48c;
        if (Build.VERSION.SDK_INT >= 29) {
            k1.f(paint, k1.l0.A(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(k1.l0.J(i)));
        }
    }

    public void H(long j10) {
        ((Paint) this.f48c).setColor(k1.l0.F(j10));
    }

    public void I(k1.s sVar) {
        ColorFilter colorFilter;
        this.e = sVar;
        Paint paint = (Paint) this.f48c;
        if (sVar != null) {
            colorFilter = sVar.f19525a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public void J(int i) {
        boolean z3;
        Paint paint = (Paint) this.f48c;
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        paint.setFilterBitmap(!z3);
    }

    public void K(k1.i iVar) {
        DashPathEffect dashPathEffect;
        Paint paint = (Paint) this.f48c;
        if (iVar != null) {
            dashPathEffect = iVar.f19487a;
        } else {
            dashPathEffect = null;
        }
        paint.setPathEffect(dashPathEffect);
        this.f50f = iVar;
    }

    public void L(Shader shader) {
        this.f49d = shader;
        ((Paint) this.f48c).setShader(shader);
    }

    public void M(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f48c;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void N(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.f48c;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void O(float f10) {
        ((Paint) this.f48c).setStrokeWidth(f10);
    }

    public void P(int i) {
        Paint.Style style;
        Paint paint = (Paint) this.f48c;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public int Q() {
        char charAt;
        int i = this.f47b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f50f;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.f47b = i;
        return i;
    }

    public int R(int i) {
        i c10 = ((j) this.f48c).f73c.c(i);
        int i10 = i - c10.f1196a;
        return (int) ((c) ((h) c10.f1198c).f58b.invoke(d0.f36a, Integer.valueOf(i10))).f26a;
    }

    public boolean S() {
        int Q = Q();
        String str = (String) this.f50f;
        if (Q >= str.length() || Q == -1 || str.charAt(Q) != ',') {
            return false;
        }
        this.f47b++;
        return true;
    }

    public void T(char c10) {
        String str;
        String str2 = (String) this.f50f;
        int i = this.f47b;
        if (i > 0 && c10 == '\"') {
            try {
                this.f47b = i - 1;
                String j10 = j();
                this.f47b = i;
                if (kotlin.jvm.internal.a(j10, "null")) {
                    t("Expected string literal but 'null' literal was found", this.f47b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f47b = i;
                throw th;
            }
        }
        String p10 = gg.k.p(gg.k.g(c10));
        int i10 = this.f47b;
        int i11 = i10 - 1;
        if (i10 != str2.length() && i11 >= 0) {
            str = String.valueOf(str2.charAt(i11));
        } else {
            str = "EOF";
        }
        u(this, a5.a.h("Expected ", p10, ", but had '", str, "' instead"), i11, 4);
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i10 = i + 4;
        if (i10 >= charSequence.length()) {
            this.f47b = i;
            if (i10 < charSequence.length()) {
                return a(charSequence, this.f47b);
            }
            u(this, "Unexpected EOF during unicode escape", 0, 6);
            throw null;
        }
        ((StringBuilder) this.e).append((char) (v(charSequence, i + 3) + (v(charSequence, i) << 12) + (v(charSequence, i + 1) << 8) + (v(charSequence, i + 2) << 4)));
        return i10;
    }

    public boolean b() {
        int i = this.f47b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f50f;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f47b = i;
                if (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') {
                    return false;
                }
                return true;
            }
            i++;
        }
        this.f47b = i;
        return false;
    }

    public void c(int i, String str) {
        String str2 = (String) this.f50f;
        if (str2.length() - i >= str.length()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) != (str2.charAt(i + i10) | ' ')) {
                    u(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, 6);
                    throw null;
                }
            }
            this.f47b = str.length() + i;
            return;
        }
        u(this, "Unexpected end of boolean literal", 0, 6);
        throw null;
    }

    public String d() {
        String str;
        char c10;
        String str2;
        StringBuilder sb2 = (StringBuilder) this.e;
        String str3 = (String) this.f50f;
        g('\"');
        int i = this.f47b;
        int r8 = mf.f.r(str3, '\"', i, 4);
        if (r8 == -1) {
            j();
            int i10 = this.f47b;
            if (i10 != str3.length() && i10 >= 0) {
                str2 = String.valueOf(str3.charAt(i10));
            } else {
                str2 = "EOF";
            }
            u(this, a.k("Expected quotation mark '\"', but had '", str2, "' instead"), i10, 4);
            throw null;
        }
        int i11 = i;
        while (i11 < r8) {
            if (str3.charAt(i11) == '\\') {
                int i12 = this.f47b;
                char charAt = str3.charAt(i11);
                boolean z3 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb2.append((CharSequence) str3, i12, i11);
                        int E = E(i11 + 1);
                        if (E != -1) {
                            int i13 = E + 1;
                            char charAt2 = str3.charAt(E);
                            if (charAt2 == 'u') {
                                i13 = a(str3, i13);
                            } else {
                                if (charAt2 < 'u') {
                                    c10 = gg.d.f17764a[charAt2];
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    sb2.append(c10);
                                } else {
                                    u(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                    throw null;
                                }
                            }
                            i12 = E(i13);
                            if (i12 == -1) {
                                u(this, "Unexpected EOF", i12, 4);
                                throw null;
                            }
                        } else {
                            u(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= str3.length()) {
                            sb2.append((CharSequence) str3, i12, i11);
                            i12 = E(i11);
                            if (i12 == -1) {
                                u(this, "Unexpected EOF", i12, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str3.charAt(i11);
                        }
                    }
                    i11 = i12;
                    z3 = true;
                    charAt = str3.charAt(i11);
                }
                if (!z3) {
                    str = str3.subSequence(i12, i11).toString();
                } else {
                    sb2.append((CharSequence) str3, i12, i11);
                    String sb3 = sb2.toString();
                    sb2.setLength(0);
                    str = sb3;
                }
                this.f47b = i11 + 1;
                return str;
            }
            i11++;
        }
        this.f47b = r8 + 1;
        return str3.substring(i, r8);
    }

    public byte e() {
        String str = (String) this.f50f;
        int i = this.f47b;
        while (i != -1 && i < str.length()) {
            int i10 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f47b = i10;
                return gg.k.g(charAt);
            }
            i = i10;
        }
        this.f47b = str.length();
        return (byte) 10;
    }

    public byte f(byte b10) {
        String str;
        String str2 = (String) this.f50f;
        byte e = e();
        if (e != b10) {
            String p10 = gg.k.p(b10);
            int i = this.f47b;
            int i10 = i - 1;
            if (i != str2.length() && i10 >= 0) {
                str = String.valueOf(str2.charAt(i10));
            } else {
                str = "EOF";
            }
            u(this, a5.a.h("Expected ", p10, ", but had '", str, "' instead"), i10, 4);
            throw null;
        }
        return e;
    }

    public void g(char c10) {
        int i = this.f47b;
        if (i != -1) {
            String str = (String) this.f50f;
            while (i < str.length()) {
                int i10 = i + 1;
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f47b = i10;
                    if (charAt == c10) {
                        return;
                    }
                    T(c10);
                    throw null;
                }
                i = i10;
            }
            this.f47b = -1;
            T(c10);
            throw null;
        }
        T(c10);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018e, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0192, code lost:
    
        u(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0161, code lost:
    
        u(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0179, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017a, code lost:
    
        u(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0143, code lost:
    
        if (r11 != 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0145, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0180, code lost:
    
        l4.a.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0185, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0186, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0198, code lost:
    
        u(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0105, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        u(r22, "Unexpected symbol '" + r5 + "' in numeric literal", r7, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0103, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0106, code lost:
    
        if (r1 == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0108, code lost:
    
        if (r14 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
    
        if (r1 == (r12 - 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0113, code lost:
    
        if (r3 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        if (r5 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011d, code lost:
    
        if (r2.charAt(r12) != '\"') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0122, code lost:
    
        u(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012a, code lost:
    
        u(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0130, code lost:
    
        r22.f47b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0134, code lost:
    
        if (r13 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0136, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0139, code lost:
    
        if (r11 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014a, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0155, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0187, code lost:
    
        if (r14 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long h() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.f0.h():long");
    }

    public String i() {
        String str = (String) this.f49d;
        if (str != null) {
            str.getClass();
            this.f49d = null;
            return str;
        }
        return d();
    }

    public String j() {
        String str;
        StringBuilder sb2 = (StringBuilder) this.e;
        String str2 = (String) this.f50f;
        String str3 = (String) this.f49d;
        if (str3 != null) {
            str3.getClass();
            this.f49d = null;
            return str3;
        }
        int Q = Q();
        if (Q < str2.length() && Q != -1) {
            byte g8 = gg.k.g(str2.charAt(Q));
            if (g8 == 1) {
                return i();
            }
            if (g8 == 0) {
                boolean z3 = false;
                while (gg.k.g(str2.charAt(Q)) == 0) {
                    Q++;
                    if (Q >= str2.length()) {
                        sb2.append((CharSequence) str2, this.f47b, Q);
                        int E = E(Q);
                        if (E == -1) {
                            this.f47b = Q;
                            sb2.append((CharSequence) str2, 0, 0);
                            String sb3 = sb2.toString();
                            sb2.setLength(0);
                            return sb3;
                        }
                        Q = E;
                        z3 = true;
                    }
                }
                int i = this.f47b;
                if (!z3) {
                    str = str2.subSequence(i, Q).toString();
                } else {
                    sb2.append((CharSequence) str2, i, Q);
                    String sb4 = sb2.toString();
                    sb2.setLength(0);
                    str = sb4;
                }
                this.f47b = Q;
                return str;
            }
            u(this, "Expected beginning of the string, but got " + str2.charAt(Q), 0, 6);
            throw null;
        }
        u(this, "EOF", Q, 4);
        throw null;
    }

    public void k(boolean z3) {
        for (f4.d dVar : ((f4.h) this.f48c).d()) {
            if (dVar != null && z3) {
                dVar.f16711w.k(true);
            }
        }
    }

    public boolean l() {
        if (this.f47b < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (f4.d dVar : ((f4.h) this.f48c).d()) {
            if (dVar != null && C(dVar) && dVar.f16711w.l()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dVar);
                z3 = true;
            }
        }
        if (((ArrayList) this.e) != null) {
            for (int i = 0; i < ((ArrayList) this.e).size(); i++) {
                f4.d dVar2 = (f4.d) ((ArrayList) this.e).get(i);
                if (arrayList == null || !arrayList.contains(dVar2)) {
                    dVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z3;
    }

    public void m(boolean z3) {
        for (f4.d dVar : ((f4.h) this.f48c).d()) {
            if (dVar != null && z3) {
                dVar.f16711w.m(true);
            }
        }
    }

    public void n(boolean z3) {
        for (f4.d dVar : ((f4.h) this.f48c).d()) {
            if (dVar != null && z3) {
                dVar.f16711w.n(true);
            }
        }
    }

    public boolean o() {
        if (this.f47b >= 1) {
            for (f4.d dVar : ((f4.h) this.f48c).d()) {
                if (dVar != null && dVar.f16711w.o()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void p() {
        if (this.f47b >= 1) {
            for (f4.d dVar : ((f4.h) this.f48c).d()) {
                if (dVar != null) {
                    dVar.f16711w.p();
                }
            }
        }
    }

    public void q(boolean z3) {
        for (f4.d dVar : ((f4.h) this.f48c).d()) {
            if (dVar != null && z3) {
                dVar.f16711w.q(true);
            }
        }
    }

    public boolean r() {
        boolean z3 = false;
        if (this.f47b < 1) {
            return false;
        }
        for (f4.d dVar : ((f4.h) this.f48c).d()) {
            if (dVar != null && C(dVar) && dVar.f16711w.r()) {
                z3 = true;
            }
        }
        return z3;
    }

    public void s() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public void t(String str, int i, String str2) {
        String concat;
        str2.getClass();
        if (str2.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(str2);
        }
        throw gg.k.e(i, str + " at path: " + ((e1) this.f48c).f() + concat, (String) this.f50f);
    }

    public String toString() {
        switch (this.f46a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("FragmentManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            case 3:
                StringBuilder sb3 = new StringBuilder("JsonReader(source='");
                sb3.append(this.f50f);
                sb3.append("', currentPosition=");
                return a5.a.i(sb3, this.f47b, ')');
            default:
                return super.toString();
        }
    }

    public int v(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        u(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public e0 w(int i) {
        ArrayList arrayList;
        int i10 = this.f47b;
        int i11 = i * i10;
        int A = A() - i11;
        if (i10 > A) {
            i10 = A;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 == this.f50f.size()) {
            arrayList = this.f50f;
        } else {
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList2.add(new c(1));
            }
            this.f50f = arrayList2;
            arrayList = arrayList2;
        }
        return new e0(i11, arrayList);
    }

    public int x(int i) {
        if (A() <= 0) {
            return 0;
        }
        if (i >= A()) {
            a.a("ItemIndex > total count");
        }
        return i / this.f47b;
    }

    public int y() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.f48c).getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = k1.g.f19478a[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public int z() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.f48c).getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = k1.g.f19479b[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public f0(j jVar) {
        this.f46a = 0;
        this.f48c = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new de.b(0, 0));
        this.f49d = arrayList;
        this.e = new ArrayList();
        this.f50f = qe.s.f24023u;
    }

    public f0(Paint paint) {
        this.f46a = 4;
        this.f48c = paint;
        this.f47b = 3;
    }

    public f0(i0 i0Var) {
        this.f46a = 5;
        ArrayList arrayList = (ArrayList) i0Var.f18637w;
        int size = arrayList.size();
        this.f48c = (String[]) ((ArrayList) i0Var.f18636v).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f49d = dArr;
        ArrayList arrayList2 = (ArrayList) i0Var.f18638x;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            dArr2[i10] = ((Double) arrayList2.get(i10)).doubleValue();
        }
        this.e = dArr2;
        this.f50f = new int[size];
        this.f47b = 0;
    }

    public f0() {
        this.f46a = 2;
        this.f49d = new ArrayList();
        final int i = 0;
        this.f48c = new f4.h(0);
        new h0(this);
        this.f50f = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new eb.x(this);
        new CopyOnWriteArrayList();
        new p3.a(this) { // from class: f4.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f16716b;

            {
                this.f16716b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f16716b.k(false);
                        return;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f16716b.m(false);
                            return;
                        }
                        return;
                    case 2:
                        boolean z3 = ((f3.b) obj).f16651a;
                        this.f16716b.n(false);
                        return;
                    default:
                        boolean z9 = ((r) obj).f16703a;
                        this.f16716b.q(false);
                        return;
                }
            }
        };
        final int i10 = 1;
        new p3.a(this) { // from class: f4.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f16716b;

            {
                this.f16716b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f16716b.k(false);
                        return;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f16716b.m(false);
                            return;
                        }
                        return;
                    case 2:
                        boolean z3 = ((f3.b) obj).f16651a;
                        this.f16716b.n(false);
                        return;
                    default:
                        boolean z9 = ((r) obj).f16703a;
                        this.f16716b.q(false);
                        return;
                }
            }
        };
        final int i11 = 2;
        new p3.a(this) { // from class: f4.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f16716b;

            {
                this.f16716b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f16716b.k(false);
                        return;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f16716b.m(false);
                            return;
                        }
                        return;
                    case 2:
                        boolean z3 = ((f3.b) obj).f16651a;
                        this.f16716b.n(false);
                        return;
                    default:
                        boolean z9 = ((r) obj).f16703a;
                        this.f16716b.q(false);
                        return;
                }
            }
        };
        final int i12 = 3;
        new p3.a(this) { // from class: f4.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f16716b;

            {
                this.f16716b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.f16716b.k(false);
                        return;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f16716b.m(false);
                            return;
                        }
                        return;
                    case 2:
                        boolean z3 = ((f3.b) obj).f16651a;
                        this.f16716b.n(false);
                        return;
                    default:
                        boolean z9 = ((r) obj).f16703a;
                        this.f16716b.q(false);
                        return;
                }
            }
        };
        this.f47b = -1;
        new ArrayDeque();
        new a6.x(15, this);
    }

    public f0(String str) {
        this.f46a = 3;
        str.getClass();
        e1 e1Var = new e1(8, (char) 0);
        e1Var.f1180c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        e1Var.f1181d = iArr;
        e1Var.f1179b = -1;
        this.f48c = e1Var;
        this.e = new StringBuilder();
        this.f50f = str;
    }
}

package x7;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import r0.i1;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f30195a = qe.k.u(new String[]{"paper:hearts", "paper:hearts_fine", "paper:kisses", "paper:love_letter", "paper:blush", "fill:Rubor", "fill:Rosa polvo", "fill:Frambuesa", "fill:Vino", "fill:Oro rosa", "fill:Romance", "fill:Algodón", "fill:Vino int.", "magic:amor", "magic:kisses", "cover:love_hearts", "cover:love_kisses", "cover:love_letter"});

    /* renamed from: b, reason: collision with root package name */
    public static final b1.y f30196b = new b1.y();

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f30197c = r0.y.B(Boolean.FALSE);

    /* renamed from: d, reason: collision with root package name */
    public static final b1.y f30198d = new b1.y();

    public static boolean a(String str) {
        Object obj = f30198d.get(str);
        Boolean bool = Boolean.TRUE;
        if (!kotlin.jvm.internal.l.a(obj, bool)) {
            if (((Boolean) f30197c.getValue()).booleanValue() || !f30195a.contains(str) || kotlin.jvm.internal.l.a(f30196b.get(str), bool)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void b(Context context, String str) {
        b1.y yVar = f30198d;
        Object obj = yVar.get(str);
        Boolean bool = Boolean.TRUE;
        if (kotlin.jvm.internal.l.a(obj, bool)) {
            return;
        }
        yVar.put(str, bool);
        context.getSharedPreferences("scraply_new_content", 0).edit().putStringSet("obtained", qe.l.U(yVar.f1409w)).apply();
    }

    public static void c(Context context, String str) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_new_content", 0);
        b1.y yVar = f30198d;
        if (yVar.remove(str) != null) {
            sharedPreferences.edit().putStringSet("obtained", qe.l.U(yVar.f1409w)).apply();
        }
        if (f30195a.contains(str)) {
            b1.y yVar2 = f30196b;
            Object obj = yVar2.get(str);
            Boolean bool = Boolean.TRUE;
            if (!kotlin.jvm.internal.l.a(obj, bool)) {
                yVar2.put(str, bool);
                sharedPreferences.edit().putStringSet("seen", qe.l.U(yVar2.f1409w)).apply();
            }
        }
    }
}

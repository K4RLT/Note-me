package p7;
import m.d;
import m.g;

import androidx.ink.brush.BrushCoat;
import androidx.ink.brush.BrushFamily;
import androidx.ink.brush.BrushPaint;
import androidx.ink.brush.SelfOverlap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f22543a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f22544b = new HashMap();

    public static final BrushFamily a(BrushFamily brushFamily, String str) {
        brushFamily.getClass();
        HashMap hashMap = f22543a;
        BrushFamily brushFamily2 = (BrushFamily) hashMap.get(str);
        if (brushFamily2 != null) {
            return brushFamily2;
        }
        List<BrushCoat> coats = brushFamily.getCoats();
        ArrayList arrayList = new ArrayList(qe.d(coats, 10));
        for (BrushCoat brushCoat : coats) {
            BrushPaint brushPaint = (BrushPaint) qe.l.x(brushCoat.getPaintPreferences());
            if (brushPaint == null) {
                brushPaint = new BrushPaint((List) null, (List) null, (SelfOverlap) null, 7, (kotlin.jvm.internal.f) null);
            }
            arrayList.add(brushCoat.copy(brushCoat.getTip(), qe.g(new BrushPaint(brushPaint.getTextureLayers(), brushPaint.getColorFunctions(), SelfOverlap.ACCUMULATE))));
        }
        BrushFamily build = new BrushFamily.Builder().setCoats(arrayList).setInputModel(brushFamily.getInputModel()).setClientBrushFamilyId(str).build();
        hashMap.put(str, build);
        return build;
    }

    public static final BrushFamily b(BrushFamily brushFamily) {
        String g8;
        brushFamily.getClass();
        HashMap hashMap = f22544b;
        BrushFamily brushFamily2 = (BrushFamily) hashMap.get(brushFamily);
        if (brushFamily2 != null) {
            return brushFamily2;
        }
        List<BrushCoat> coats = brushFamily.getCoats();
        ArrayList arrayList = new ArrayList(qe.d(coats, 10));
        for (BrushCoat brushCoat : coats) {
            BrushPaint brushPaint = (BrushPaint) qe.l.x(brushCoat.getPaintPreferences());
            if (brushPaint == null) {
                brushPaint = new BrushPaint((List) null, (List) null, (SelfOverlap) null, 7, (kotlin.jvm.internal.f) null);
            }
            arrayList.add(brushCoat.copy(brushCoat.getTip(), qe.g(new BrushPaint(brushPaint.getTextureLayers(), brushPaint.getColorFunctions(), SelfOverlap.ANY))));
        }
        String clientBrushFamilyId = brushFamily.getClientBrushFamilyId();
        BrushFamily.Builder inputModel = new BrushFamily.Builder().setCoats(arrayList).setInputModel(brushFamily.getInputModel());
        if (clientBrushFamilyId.length() == 0) {
            g8 = "";
        } else {
            g8 = a5.a.g(clientBrushFamilyId, "-flat");
        }
        BrushFamily build = inputModel.setClientBrushFamilyId(g8).build();
        hashMap.put(brushFamily, build);
        return build;
    }
}

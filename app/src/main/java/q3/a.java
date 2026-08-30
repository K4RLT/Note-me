package q3;
import c.j;
import l.a;
import l.b;
import l.c;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.daren.scraply.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final b f23377a;

    public a(b bVar) {
        this.f23377a = bVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f23377a.f23380a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        k6.i a10 = this.f23377a.a(view);
        if (a10 != null) {
            return (AccessibilityNodeProvider) a10.f19569v;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f23377a.f23380a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z3;
        Object obj;
        Object tag2;
        Object obj2;
        int i;
        r3.e eVar = new r3.e(accessibilityNodeInfo);
        boolean z9 = p.f23420a;
        int i10 = Build.VERSION.SDK_INT;
        ClickableSpan[] clickableSpanArr = null;
        if (i10 >= 28) {
            tag = Boolean.valueOf(c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z10 = true;
        int i11 = 0;
        if (bool != null && bool.booleanValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i10 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z3);
        } else {
            eVar.f(1, z3);
        }
        if (i10 >= 28) {
            obj = Boolean.valueOf(b(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            if (Boolean.class.isInstance(tag3)) {
                obj = tag3;
            } else {
                obj = null;
            }
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null || !bool2.booleanValue()) {
            z10 = false;
        }
        if (i10 >= 28) {
            accessibilityNodeInfo.setHeading(z10);
        } else {
            eVar.f(2, z10);
        }
        if (i10 >= 28) {
            tag2 = l.a(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i10 >= 30) {
            obj2 = n.a(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag4)) {
                obj2 = tag4;
            } else {
                obj2 = null;
            }
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i10 >= 30) {
            f2.j(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f23377a.b(view, eVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i10 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i14 = 0;
                while (i14 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i14];
                    int i15 = i11;
                    while (true) {
                        if (i15 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                i = sparseArray2.keyAt(i15);
                                break;
                            }
                            i15++;
                        } else {
                            i = r3.e.f24536d;
                            r3.e.f24536d = i + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i14]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i14];
                    Spanned spanned = (Spanned) text;
                    eVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    eVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    eVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    eVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    i14++;
                    i11 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            eVar.a((r3.d) list.get(i16));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f23377a.f23380a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f23377a.f23380a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        b bVar = this.f23377a;
        bVar.getClass();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i10 = 0; i10 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((r3.d) list.get(i10)).f24534a).getId() != i; i10++) {
        }
        boolean performAccessibilityAction = bVar.f23380a.performAccessibilityAction(view, i, bundle);
        if (!performAccessibilityAction && i == R.id.accessibility_action_clickable_span && bundle != null) {
            int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                    if (clickableSpan.equals(clickableSpanArr[i12])) {
                        clickableSpan.onClick(view);
                        return true;
                    }
                }
            }
            return false;
        }
        return performAccessibilityAction;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f23377a.f23380a.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f23377a.f23380a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

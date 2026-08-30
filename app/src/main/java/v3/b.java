package v3;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import c2.c3;
import com.daren.scraply.R;
import j.d0;
import j.e0;
import q.x;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {
    public c A;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27377u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27378v;

    /* renamed from: w, reason: collision with root package name */
    public Cursor f27379w;

    /* renamed from: x, reason: collision with root package name */
    public int f27380x;

    /* renamed from: y, reason: collision with root package name */
    public c3 f27381y;

    /* renamed from: z, reason: collision with root package name */
    public a f27382z;

    public abstract void a(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f27379w;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c3 c3Var = this.f27381y;
                if (c3Var != null) {
                    cursor2.unregisterContentObserver(c3Var);
                }
                a aVar = this.f27382z;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f27379w = cursor;
            if (cursor != null) {
                c3 c3Var2 = this.f27381y;
                if (c3Var2 != null) {
                    cursor.registerContentObserver(c3Var2);
                }
                a aVar2 = this.f27382z;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.f27380x = cursor.getColumnIndexOrThrow("_id");
                this.f27377u = true;
                notifyDataSetChanged();
            } else {
                this.f27380x = -1;
                this.f27377u = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String e(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f27377u && (cursor = this.f27379w) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f27377u) {
            this.f27379w.moveToPosition(i);
            if (view == null) {
                e0 e0Var = (e0) this;
                view = e0Var.D.inflate(e0Var.C, viewGroup, false);
            }
            a(view, this.f27379w);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [v3.c, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.A == null) {
            Filter filter = new Filter();
            filter.f27383a = this;
            this.A = filter;
        }
        return this.A;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.f27377u && (cursor = this.f27379w) != null) {
            cursor.moveToPosition(i);
            return this.f27379w;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f27377u || (cursor = this.f27379w) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f27379w.getLong(this.f27380x);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f27377u) {
            if (this.f27379w.moveToPosition(i)) {
                if (view == null) {
                    e0 e0Var = (e0) this;
                    view = e0Var.D.inflate(e0Var.B, viewGroup, false);
                    view.setTag(new d0(view));
                    ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(e0Var.I);
                }
                a(view, this.f27379w);
                return view;
            }
            x.o(g3.a.g(i, "couldn't move cursor to position "));
            return null;
        }
        x.o("this should only be called when the cursor is valid");
        return null;
    }
}
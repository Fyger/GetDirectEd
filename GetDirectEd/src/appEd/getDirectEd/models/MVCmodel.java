package appEd.getDirectEd.models;

import java.util.ArrayList;
import appEd.getDirectEd.views.MVCview;

/**
 * @author James
 *
 * This is the abstract class for the Models. It allows for ease of updating
 * of the associated views of this model
 * 
 * @param <V extends MVCview> - allows for this model to easily update the
 * associated views by giving the model a list of views currently active and 
 * updating them
 */
public class MVCmodel<V extends MVCview> {
	/**
	 *   Variables
	 * views - the list of views that are currently active and have been
	 * stored in the model  
	 */
	private final ArrayList<V> views;

	/**
	 * the creation for the MVCmodel creates the list of MVCviews 
	 */
	public MVCmodel() {
		views = new ArrayList<V>();
	}

	/**
	 * adds the newest view associated with the model to the list of views
	 * 
	 * @param view - the extended MVCview that is currently active
	 * should be added upon creation of the view
	 */
	public void addView(V view) {
		if (!views.contains(view)) {
			views.add(view);
		}
	}

	/**
	 * when a view is removed from the stack, the associated view within the model
	 * should as well be removed from the list of potential update calls
	 * 
	 * @param view - the extended MVCview that is currently being discontinued
	 */
	public void deleteView(V view) {
		views.remove(view);
	}

	/**
	 * this function is called within the model whenever a major change to the internal
	 * data has been made. Examples could be changing values within a model or additional
	 * refinement of searches in regards to databases
	 */
	public void notifyViews() {
		for (V view : views) {
			view.update(this);
		}
	}

}

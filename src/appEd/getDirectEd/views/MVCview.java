package appEd.getDirectEd.views;

/** 
 * @author James Helberg
 *
 * MVCview is used in the Model View Controller styling for the creation and 
 * association of views with a model and controller.
 * 
 * This is adapted to allow us the freedom of creating multiple views for the
 * same data for display for the user
 * 
 * @param <M> - the model type this view is associated with. Prevents multiple
 * models sharing the same view implementation
 */
public interface MVCview<M> {
	/**
	 * this is an abstract for the update that will receive the model that this
	 * view is associated with for updating.
	 * @param model - the model that this view is associated with
	 */
	public void update(M model);

}

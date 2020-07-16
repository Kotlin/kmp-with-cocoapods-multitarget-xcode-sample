import WatchKit
import Foundation
import kotlin_library


class InterfaceController: WKInterfaceController {

    override func awake(withContext context: Any?) {
        AKt.bar()
        AKt.bazz()
        super.awake(withContext: context)
        
        // Configure interface objects here.
    }
    
    override func willActivate() {
        // This method is called when watch view controller is about to be visible to user
        super.willActivate()
    }
    
    override func didDeactivate() {
        // This method is called when watch view controller is no longer visible
        super.didDeactivate()
    }

}

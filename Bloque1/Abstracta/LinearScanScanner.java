public class LinearScanScanner extends VirusScanEngine {
    
    private static final byte[][] virusSignatures = new byte[][]{

        new byte[] {'I','L','A','O' ,'V','E','E','Y' ,'U'}, 
        new byte[] {'M','e','l','i' ,'s','a','E','Y' ,'U'}
    };

    @Override
    void deleteVirus(byte[] memory, int startIndex, int size) {
        // TODO Auto-generated method stub
        
    }

    @Override
    int findVirus(byte[] memory, int startIndex) {
        int size = 0; 
        scan:
        {

            signatures: for(int v=0;v < virusSignatures.length;v++){
                for(int t = 0;t <virusSignatures[v].length;t++){

                    if(memory[startIndex + t] != virusSignatures[v][t]){
                        break scan;
                    }
                }
                size = virusSignatures[v].length; 
                break signatures; 
            }
        }
        
        return size;
    }
    

    @Override
    void reportVirus(byte[] memory, int startIndex, int size) {
        // TODO Auto-generated method stub
        
    }

    
}

class Client {
	String ip;
	Vector<Client> mPeers;
	Classificationgroup Group;
	int rank;

    public Client (int maximumNumberOfPeers ) {
        peers = new Vector<Client> ();
    }

    public void addPeer(Client peer) {
    	peers.add(peer);
    }

    public void removePeer(Client peerToBeRemoved) {

    }

}